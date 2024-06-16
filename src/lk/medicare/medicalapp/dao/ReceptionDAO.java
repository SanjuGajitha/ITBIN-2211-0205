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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.medicare.medicalapp.db.DBConnection;
import lk.medicare.medicalapp.model.Doctor;
import lk.medicare.medicalapp.model.Patient;
import lk.medicare.medicalapp.model.Reception;



public class ReceptionDAO {
    
    
    
     public void addReception(Reception reception){
        
        
         String sql;
        sql = "INSERT INTO receptionisttb1(RecepName,RecepPhone,RecepAdd,RecepPass) VALUES(?,?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,reception.getReceptionName());
            stmt.setString(2,reception.getReceptionPhoneNo());
            stmt.setString(3,reception.getReceptionAddress());
            stmt.setString(4,reception.getReceptionPassword());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
     public void update1(Reception reception){
        String sql = "UPDATE receptionisttb1 SET RecepName = ?, RecepPhone = ?, RecepAdd = ?, RecepPass = ?,WHERE ReceptId = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,reception.getReceptionName());
            stmt.setString(2,reception.getReceptionPhoneNo());
            stmt.setString(3,reception.getReceptionAddress());
            stmt.setString(4,reception.getReceptionPassword());
           
            stmt.setInt(5,reception.getReceptionId());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
     
    public void delete(int id) throws SQLException {
       
       System.out.println(id);
       
        String deleteQuery = "DELETE FROM receptionisttb1 WHERE ReceptId = '"+id+"'";
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
    
    
    
    
    public void update(Reception reception){
        String sql = "UPDATE receptionisttb1 SET RecepName = ?, RecepPass = ?, RecepPhone = ? WHERE ReceptId = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,reception.getReceptionName());
            stmt.setString(2,reception.getReceptionPassword());
            stmt.setString(3,reception.getReceptionPhoneNo());
             stmt.setInt(4,reception.getReceptionId());
       
           
            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(new JFrame(),"DATA Updated Successfully ");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
     
     
      public List<String[]> getAllRecep1() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM receptionisttb1";

    try{
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[5]; // Assuming username and password
        
                user[0] = String.valueOf(rs.getInt("ReceptId")); 
                user[1] = rs.getString("RecepName");
                user[2] = rs.getString("RecepPass");
                user[3] = rs.getString("RecepPhone"); 
                user[4] = rs.getString("RecepAdd");
               
                
                
                userData.add(user);
       
      }
      } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
      }
    
}
