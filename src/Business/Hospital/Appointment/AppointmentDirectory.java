/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Appointment;

import java.util.ArrayList;

/**
 *
 * @author sarthakgoel
 */
public class AppointmentDirectory 
{
    private ArrayList<AppointmentDetails> appointmentDirectory;
    
    public AppointmentDirectory()
    {
        this.appointmentDirectory = new ArrayList<AppointmentDetails>();
    }

    public ArrayList<AppointmentDetails> getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(ArrayList<AppointmentDetails> appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }
    
    public AppointmentDetails addAppointment()
    {
        AppointmentDetails appointment = new AppointmentDetails();
        appointmentDirectory.add(appointment);
        return appointment;
    }
    public void deletePatient(AppointmentDetails appointment)
    {
        appointmentDirectory.remove(appointment);
    }
}
