/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

/**
 *
 * @author aviti
 */
public class BloodInchargeNurseWorkQueue extends WorkRequest {
    
    
    private String bloodType;
    private String bloodQuantity;
    private String patientName;

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodQuantity() {
        return bloodQuantity;
    }

    public void setBloodQuantity(String bloodQuantity) {
        this.bloodQuantity = bloodQuantity;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
        
        
    }
    
    @Override
    public String toString(){
        return patientName;
    }
}
