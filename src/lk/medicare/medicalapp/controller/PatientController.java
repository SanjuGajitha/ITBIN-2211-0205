/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.medicare.medicalapp.dao.PatientDAO;
import lk.medicare.medicalapp.db.DBConnection;
import lk.medicare.medicalapp.model.Patient;
import lk.medicare.medicalapp.view.PatientView;


/**
 *
 * @author sanjula
 */
public class PatientController {
    
    private final PatientView view;
    private  PatientDAO dao;

    public PatientController(PatientView view) {
        this.view = view;
         this.dao = new PatientDAO(); 
        initComponents();
    }
    

    private void initComponents() {
         //To change body of generated methods, choose Tools | Templates.
        
    }
    public void delete(int id) {
        try {
            dao.delete(id);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    
     public void update(Patient patient) {
     
        try {
            dao.update(patient);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    
    

}
