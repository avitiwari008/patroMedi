/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Appointment;

import Buisness.UserInfo.PatientInfo;
import java.util.Date;

/**
 *
 * @author sarthakgoel
 */
public class AppointmentDetails 
{
    private PatientInfo patient;
    private String illness;
    private String prescription;
    private boolean isBloodRequired;
    private boolean isFinAHelpReqd;
    private Date date;
    private String hospitalName;
    private String doctorName;
    private String cityTreated;
    private boolean appointmentTake;

    public PatientInfo getPatient() {
        return patient;
    }

    public boolean isAppointmentTake() {
        return appointmentTake;
    }

    public void setAppointmentTake(boolean appointmentTake) {
        this.appointmentTake = appointmentTake;
    }
     
   public void setPatient(PatientInfo patient) {
        this.patient = patient;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getCityTreated() {
        return cityTreated;
    }

    public void setCityTreated(String cityTreated) {
        this.cityTreated = cityTreated;
    }
    
    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public boolean isIsBloodRequired() {
        return isBloodRequired;
    }

    public void setIsBloodRequired(boolean isBloodRequired) {
        this.isBloodRequired = isBloodRequired;
    }

    public boolean isIsFinAHelpReqd() {
        return isFinAHelpReqd;
    }

    public void setIsFinAHelpReqd(boolean isFinAHelpReqd) {
        this.isFinAHelpReqd = isFinAHelpReqd;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }    
}
