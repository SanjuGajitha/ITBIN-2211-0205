/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.controller;

import javax.swing.JOptionPane;
import lk.medicare.medicalapp.dao.ReceptionDAO;
import lk.medicare.medicalapp.dao.TestDAO;
import lk.medicare.medicalapp.model.TestLab;
import lk.medicare.medicalapp.view.ReceptionView;
import lk.medicare.medicalapp.view.TestView;

/**
 *
 * @author sanjula
 */
public class TestController {
    
    private final  TestView  view;
    private  TestDAO dao;

    public TestController( TestView view) {
        this.view = view;
         this.dao = new TestDAO(); 
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
    
     public void update1(TestLab testlab) {
     
        try {
            dao.update(testlab);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    
}
    
    
    
    
}





