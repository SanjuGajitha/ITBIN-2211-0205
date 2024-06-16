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
import lk.medicare.medicalapp.model.Laboration;

/**
 *
 * @author sanjula
 */
public class LaborationDAO {
    
    
      public void addLabor(Laboration labor) {
        
        
         String sql;
        sql = "INSERT INTO labortb1(specimen,health,home) VALUES(?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,labor.getSpecimenType());
            stmt.setString(2,labor.getHealthScreening());
            stmt.setString(3,labor.getTestAtHome());
           
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
      public void update(Laboration labor){
        String sql = "UPDATE labortb1 SET specimen = ?, health = ?, home = ? WHERE laborid = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,labor.getSpecimenType());
            stmt.setString(2,labor.getHealthScreening());
            stmt.setString(3,labor.getTestAtHome());
            stmt.setInt(4,labor.getLaborId());
            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(new JFrame(),"DATA Updated Successfully ");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
     
     
     public void deletedlabor(int id) throws SQLException {
       
       System.out.println(id);
       
        String deleteQuery = "DELETE FROM labortb1 WHERE laborid = '"+id+"'";
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
     
     
     
     
     
      public List<String[]> getAllLabors() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM labortb1";

    try{
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[4]; // Assuming username and password
        
                user[0] = String.valueOf(rs.getInt("laborid")); 
                user[1] = rs.getString("specimen");
                user[2] = rs.getString("health");
                user[3] = rs.getString("home"); 
               
                
                
                userData.add(user);
       
      }
      } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
    
    
}
