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
public class Laboration {
    
    
    
    private int laborId;
    private String specimenType;
    private String healthScreening;
    private String testAtHome;
    
    
  public Laboration()
{
}
  
  
  
  
    public Laboration(int laboid, String specimentype, String healthscreening,String testathome) {
        this.laborId = laboid;
        this.specimenType = specimentype;
        this.healthScreening = healthscreening;
        this.testAtHome = testathome;
    
    
}

    public void setLaborId(int laborId) {
        this.laborId = laborId;
    }

    public void setSpecimenType(String specimenType) {
        this.specimenType = specimenType;
    }

    public void setHealthScreening(String healthScreening) {
        this.healthScreening = healthScreening;
    }

    public void setTestAtHome(String testAtHome) {
        this.testAtHome = testAtHome;
    }

    public int getLaborId() {
        return laborId;
    }

    public String getSpecimenType() {
        return specimenType;
    }

    public String getHealthScreening() {
        return healthScreening;
    }

    public String getTestAtHome() {
        return testAtHome;
    }
    
    

    
    
    



}


