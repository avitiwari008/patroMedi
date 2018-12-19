/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import Business.Hospital.Appointment.AppointmentDetails;

/**
 *
 * @author manor
 */
public class DoctorReceptionistFinancialWorkQueue extends WorkRequest{
    private boolean fundingRequired;
    private String prescribed;
    private AppointmentDetails apd;
    private boolean fundingApproved;

    public boolean isFundingApproved() {
        return fundingApproved;
    }

    public void setFundingApproved(boolean fundingApproved) {
        this.fundingApproved = fundingApproved;
    }

    public AppointmentDetails getApd() {
        return apd;
    }

    public void setApd(AppointmentDetails apd) {
        this.apd = apd;
    }
    
    public DoctorReceptionistFinancialWorkQueue(){
        this.apd = new AppointmentDetails();
    }
    public boolean isFundingRequired() {
        return fundingRequired;
    }

    public void setFundingRequired(boolean fundingRequired) {
        this.fundingRequired = fundingRequired;
    }

    public String getPrescribed() {
        return prescribed;
    }

    public void setPrescribed(String prescribed) {
        this.prescribed = prescribed;
    }
    @Override
    public String toString(){
        return apd.getPatient().getName();
    }
}
