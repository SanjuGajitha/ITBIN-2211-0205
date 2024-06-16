/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.model;

/**
 *
 * @author sanjula
 */
public class Reception {
    
    
    
    private int receptionId;
    private String receptionName;
    private String receptionAddress;
    private String receptionPhoneNo;
    private String receptionPassword;
   
    
    
     public Reception() {
    }

    public void setReceptionId(int receptionId) {
        this.receptionId = receptionId;
    }

    public void setReceptionName(String receptionName) {
        this.receptionName = receptionName;
    }

    public void setReceptionAddress(String receptionAddress) {
        this.receptionAddress = receptionAddress;
    }

    public void setReceptionPhoneNo(String receptionPhoneNo) {
        this.receptionPhoneNo = receptionPhoneNo;
    }

    public void setReceptionPassword(String receptionPassword) {
        this.receptionPassword = receptionPassword;
    }
    
    

    public int getReceptionId() {
        return receptionId;
    }

    public String getReceptionName() {
        return receptionName;
    }

    public String getReceptionAddress() {
        return receptionAddress;
    }

    public String getReceptionPhoneNo() {
        return receptionPhoneNo;
    }

    public String getReceptionPassword() {
        return receptionPassword;
    }
    

    
    

    
    
    
}


