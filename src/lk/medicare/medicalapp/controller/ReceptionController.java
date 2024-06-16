/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.controller;

import javax.swing.JOptionPane;
import lk.medicare.medicalapp.dao.ReceptionDAO;
import lk.medicare.medicalapp.model.Reception;
import lk.medicare.medicalapp.view.PatientView;
import static lk.medicare.medicalapp.view.PatientView.view;
import lk.medicare.medicalapp.view.ReceptionView;

/**
 *
 * @author sanjula
 */
public class ReceptionController {
    
    
    
   private final  ReceptionView  view;
    private  ReceptionDAO dao;

    public ReceptionController(ReceptionView view) {
        this.view = view;
         this.dao = new ReceptionDAO(); 
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
    
     public void update1(Reception reception) {
     
        try {
            dao.update(reception);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    
}
     
     
}
