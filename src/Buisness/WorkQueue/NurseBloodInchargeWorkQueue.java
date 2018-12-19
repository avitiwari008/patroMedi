/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import Business.Hospital.Appointment.AppointmentDetails;

/**
 *
 * @author aviti
 */
public class NurseBloodInchargeWorkQueue extends WorkRequest{
    private String bloodType;
    private int bloodQuantity;
    private String patientName;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    
    
   
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getBloodQuantity() {
        return bloodQuantity;
    }

    public void setBloodQuantity(int bloodQuantity) {
        this.bloodQuantity = bloodQuantity;
    }


    
     @Override
    public String toString(){
        return patientName;
    }
    
    
}
