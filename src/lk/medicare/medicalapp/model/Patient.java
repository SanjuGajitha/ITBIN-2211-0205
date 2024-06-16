/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.medicare.medicalapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanjula
 */
public class Patient {
    private int patientId;
    private String patientName;
    private String patientAddress;
    private String patientGender;
    private String patientDOB;
    private String patientPhoneNo;
    private String patientIsHiv;
    private String patientAllergie;
    
    
    
    
     List<Patient> userData = new ArrayList<>();
     

    public Patient() {
    }

    public Patient(int patientId, String patientName, String patientAddress, String patientGender, String patientDOB, String patientPhoneNo, String patientIsHiv, String patientAllergie) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAddress = patientAddress;
        this.patientGender = patientGender;
        this.patientDOB = patientDOB;
        this.patientPhoneNo = patientPhoneNo;
        this.patientIsHiv = patientIsHiv;
        this.patientAllergie = patientAllergie;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public String getPatientDOB() {
        return patientDOB;
    }

    public String getPatientPhoneNo() {
        return patientPhoneNo;
    }

    public String getPatientIsHiv() {
        return patientIsHiv;
    }

    public String getPatientAllergie() {
        return patientAllergie;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public void setPatientDOB(String patientDOB) {
        this.patientDOB = patientDOB;
    }

    public void setPatientPhoneNo(String patientPhoneNo) {
        this.patientPhoneNo = patientPhoneNo;
    }

    public void setPatientIsHiv(String patientIsHiv) {
        this.patientIsHiv = patientIsHiv;
    }

    public void setPatientAllergie(String patientAllergie) {
        this.patientAllergie = patientAllergie;
    }
    
     
    
    
}
