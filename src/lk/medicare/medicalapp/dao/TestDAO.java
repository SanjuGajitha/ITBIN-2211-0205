/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.medicare.medicalapp.db.DBConnection;
import lk.medicare.medicalapp.model.Doctor;
import lk.medicare.medicalapp.model.TestLab;

/**
 *
 * @author sanjula
 */
public class TestDAO {
    
    
    
     public void addTestLab(TestLab test) {
        
        
         String sql;
        sql = "INSERT INTO testtb1(TestName,TestCost,SpecialReq) VALUES(?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,test.getTestName());
            stmt.setString(2,test.getTestCost());
            stmt.setString(3,test.getSampleRequirement());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
     public void update(TestLab testlab){
        String sql = "UPDATE testtb1 SET TestName = ?, TestCost = ?, SpecialReq = ?  WHERE TestNum = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,testlab.getTestName());
            stmt.setString(2,testlab.getTestCost());
            stmt.setString(3,testlab.getSampleRequirement());
            stmt.setInt(4,testlab.getTestId());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
     
     
    public void delete(int id) throws SQLException {
       
       System.out.println(id);
       
        String deleteQuery = "DELETE FROM testtb1 WHERE TestNum = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
          //  ResultSet rs = pst.executeQuery();
         
            pst.executeUpdate();
            
//            JOptionPane.showMessageDialog(new JFrame(),"DATA Deleted Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }

    } 
     
     
     
     
      public List<String[]> getAllTest() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM testtb1";

    try{
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[5]; // Assuming username and password
        
                user[0] = String.valueOf(rs.getInt("TestNum")); 
                user[1] = rs.getString("TestName");
                user[2] = rs.getString("TestCost"); 
                user[3] = rs.getString("SpecialReq");
               
                
                
                userData.add(user);
       
      }
      } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
      }
    
    
}
