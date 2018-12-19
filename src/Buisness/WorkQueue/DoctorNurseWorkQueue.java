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
public class DoctorNurseWorkQueue extends WorkRequest{
    private AppointmentDetails appointmentDetails;

    public DoctorNurseWorkQueue() {
       appointmentDetails = new AppointmentDetails();
    }

    public AppointmentDetails getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }
    @Override
    public String toString(){
        return appointmentDetails.getPatient().getName();
    }
    
}
