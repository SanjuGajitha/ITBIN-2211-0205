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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.medicare.medicalapp.db.DBConnection;
import lk.medicare.medicalapp.model.Patient;

/**
 *
 * @author sanjula
 */
public class PatientDAO {
    
    public void addPatient(Patient patient){
        String sql = "INSERT INTO patienttb1(PatName,PatGen,PatDOB,PatAdd,PatPhone,PatHIV,PatAll) VALUES(?,?,?,?,?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,patient.getPatientName());
            stmt.setString(2,patient.getPatientGender());
            stmt.setString(3,patient.getPatientDOB());
            stmt.setString(4,patient.getPatientAddress());
            stmt.setString(5,patient.getPatientPhoneNo());
            stmt.setString(6,patient.getPatientIsHiv());
            stmt.setString(7,patient.getPatientAllergie());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void update(Patient patient){
        String sql = "UPDATE patienttb1 SET PatName = ?, PatGen = ?, PatDOB = ?, PatAdd = ?, PatPhone = ?, PatHIV = ?, PatAll = ? WHERE PatId = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,patient.getPatientName());
            stmt.setString(2,patient.getPatientGender());
            stmt.setString(3,patient.getPatientDOB());
            stmt.setString(4,patient.getPatientAddress());
            stmt.setString(5,patient.getPatientPhoneNo());
            stmt.setString(6,patient.getPatientIsHiv());
            stmt.setString(7,patient.getPatientAllergie());
            stmt.setInt(8,patient.getPatientId());
            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(new JFrame(),"DATA Updated Successfully ");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
   public void delete(int id) throws SQLException {
       
       System.out.println(id);
       
        String deleteQuery = "DELETE FROM patienttb1 WHERE PatId = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
          //  ResultSet rs = pst.executeQuery();
         
            pst.executeUpdate();
            
           // JOptionPane.showMessageDialog(new JFrame(),"DATA Deleted Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }

    }
    
//    public List<Patient> getAllPatients(){
//        List<Patient> patients = new ArrayList<>();
//        String sql = "SELECT * FROM patienttb1";
//        try{
//            Connection connection = DBConnection.getConnection();
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                Patient patient1 = new Patient();
//                
//                patient1.setPatientId(rs.getInt("PatId"));
//                patient1.setPatientName(rs.getString("PatName"));
//                patient1.setPatientGender(rs.getString("PatGen"));
//                patient1.setPatientDOB(rs.getString("PatDOB"));
//                patient1.setPatientPhoneNo(rs.getString("PatPhone"));
//                patient1.setPatientAddress(rs.getString("PatAdd"));
//                patient1.setPatientIsHiv(rs.getString("PatHIV"));
//                patient1.setPatientAllergie(rs.getString("PatAll"));
//                
//                patients.add(patient1);
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        return patients;
//    }
    
     public List<String[]> getAllPatients() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM patienttb1";

    try  {
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[8]; // Assuming username and password
        
                user[0] = String.valueOf(rs.getInt("PatId")); 
                user[1] = rs.getString("PatName");
                user[2] = rs.getString("PatGen");
                user[3] = rs.getString("PatDOB"); 
                user[4] = rs.getString("PatPhone");
                user[5] = rs.getString("PatAdd");
                user[6] = rs.getString("PatHIV"); 
                user[7] = rs.getString("PatAll");
                
                
                userData.add(user);
       
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
    
}
