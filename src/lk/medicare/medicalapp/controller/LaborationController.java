/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.controller;

import javax.swing.JOptionPane;
import lk.medicare.medicalapp.dao.LaborationDAO;
import lk.medicare.medicalapp.model.Laboration;
import lk.medicare.medicalapp.view.LaborationView;

/**
 *
 * @author sanjula
 */
public class LaborationController {
    
      private final LaborationView view;
    private  LaborationDAO dao;

    public LaborationController(LaborationView view) {
        this.view = view;
         this.dao = new LaborationDAO(); 
        initComponents();
    }

    private void initComponents() {
       //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
     public void deletedlabor(int id) {
        try {
            dao.deletedlabor(id);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    
     
      public void updatelabor( Laboration labor ) {
     
        try {
            dao.update(labor);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    

    
    
    
    
    
    
    
    
    
    
}
