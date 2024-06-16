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

/**
 *
 * @author sanjula
 */
public class DoctorDAO {
    


    public void addDoctor(Doctor doctor) {
        
        
         String sql;
        sql = "INSERT INTO doctortb1(DocName,DocGen,DocDOB,DocAdd,DocPhone,DocPassword,DocSpec,DocExp) VALUES(?,?,?,?,?,?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,doctor.getDoctorName());
            stmt.setString(2,doctor.getDoctorGender());
            stmt.setString(3,doctor.getDoctorDOB());
            stmt.setString(4,doctor.getDoctorAddress());
            stmt.setString(5,doctor.getDoctorPhoneNo());
            stmt.setString(6,doctor.getDoctorPassword());
            stmt.setString(7,doctor.getDoctorSpecialization());
            stmt.setString(8,doctor.getDoctorExperience());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
      public void update(Doctor doctor){
        String sql = "UPDATE doctortb1 SET DocName = ?, DocGen = ?, DocDOB = ?, DocAdd = ?, DocPhone = ?, DocPassword = ?, DocSpec = ?,DocExp = ? WHERE DocId = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,doctor.getDoctorName());
            stmt.setString(2,doctor.getDoctorGender());
            stmt.setString(3,doctor.getDoctorDOB());
            stmt.setString(4,doctor.getDoctorAddress());
            stmt.setString(5,doctor.getDoctorPhoneNo());
            stmt.setString(6,doctor.getDoctorPassword());
            stmt.setString(7,doctor.getDoctorSpecialization());
            stmt.setString(8,doctor.getDoctorExperience());
            stmt.setInt(9,doctor.getDoctorId());
            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(new JFrame(),"DATA Updated Successfully ");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
     
     
     public void delete(int id) throws SQLException {
       
       System.out.println(id);
       
        String deleteQuery = "DELETE FROM doctortb1 WHERE DocId = '"+id+"'";
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
     
     
     
     
     
      public List<String[]> getAllDoctors() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM doctortb1";

    try{
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[9]; // Assuming username and password
        
                user[0] = String.valueOf(rs.getInt("DocId")); 
                user[1] = rs.getString("DocName");
                user[2] = rs.getString("DocGen");
                user[3] = rs.getString("DocDOB"); 
                user[4] = rs.getString("DocAdd");
                user[5] = rs.getString("DocPhone");
                user[6] = rs.getString("DocPassword"); 
                user[7] = rs.getString("DocExp");
                user[8] = rs.getString("DocSpec");
                
                
                userData.add(user);
       
      }
      } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
     
     
    
}
