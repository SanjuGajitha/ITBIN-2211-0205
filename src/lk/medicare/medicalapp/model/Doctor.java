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
public class Doctor {
    
    private int doctorId;
    private String doctorName;
    private String doctorAddress;
    private String doctorGender;
    private String doctorDOB;
    private String doctorPhoneNo;
    private String doctorPassword;
    private String doctorExperience;
    private String doctorSpecialization;
    
    
    
     List<Doctor> userData = new ArrayList<>();
    



public Doctor()
{
}



 public Doctor(int doctorId, String doctorName, String doctorgender , String  doctordob, String doctoradd, String doctorphone, String doctorpassword, String doctorspec,String doctorexp) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorGender = doctorgender;
        this.doctorDOB = doctordob;
        this.doctorAddress = doctoradd;
        this.doctorPhoneNo = doctorphone;
        this.doctorPassword = doctorpassword;
        this.doctorSpecialization = doctorspec;
        this.doctorExperience = doctorexp;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public void setDoctorGender(String doctorGender) {
        this.doctorGender = doctorGender;
    }

    public void setDoctorDOB(String doctorDOB) {
        this.doctorDOB = doctorDOB;
    }

    public void setDoctorPhoneNo(String doctorPhoneNo) {
        this.doctorPhoneNo = doctorPhoneNo;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public void setDoctorExperience(String doctorExperience) {
        this.doctorExperience = doctorExperience;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public String getDoctorGender() {
        return doctorGender;
    }

    public String getDoctorDOB() {
        return doctorDOB;
    }

    public String getDoctorPhoneNo() {
        return doctorPhoneNo;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public String getDoctorExperience() {
        return doctorExperience;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }



}




