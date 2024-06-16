/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.controller;

import javax.swing.JOptionPane;
import lk.medicare.medicalapp.dao.DoctorDAO;
import lk.medicare.medicalapp.model.Doctor;
import lk.medicare.medicalapp.view.DoctorView;

/**
 *
 * @author sanjula
 */

public class DoctorController {
    
    private final DoctorView view;
    private  DoctorDAO dao;

    public DoctorController(DoctorView view) {
        this.view = view;
         this.dao = new DoctorDAO(); 
        initComponents();
    }
    

    private void initComponents() {
         //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
    
    
    
     public void deletedoc(int id) {
        try {
            dao.delete(id);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    
     
      public void update(Doctor doctor) {
     
        try {
            dao.update(doctor);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    
    
}
