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
public class TestLab {
    
    private int testId;
    private String testName;
    private String testCost;
    private String sampleRequirement;
   
    
    
    public TestLab()
    {  
    
    }
    
    
    public TestLab( int testid,String testname, String testcost,String samplerequirement)
    {
    
        this.testId=testid;
        this.testName=testname;
        this.testCost=testcost;
        this.sampleRequirement=samplerequirement;
    
    
    }
    
    
    
    

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setTestCost(String testCost) {
        this.testCost = testCost;
    }

    public void setSampleRequirement(String sampleRequirement) {
        this.sampleRequirement = sampleRequirement;
    }

    public int getTestId() {
        return testId;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestCost() {
        return testCost;
    }

    public String getSampleRequirement() {
        return sampleRequirement;
    }
    
    
    
    
    
    
    
    
}
