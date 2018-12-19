/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import java.util.Date;

/**
 *
 * @author sarthakgoel
 */
public class CharityAcknowledgedWorkRequest extends WorkRequest
{
    private String patientName;
    private String charityName;
    private String city;
    private String hospitalName;
    private Date dateAcknowledged;
    private String fundsSponsored;

    public String getFundsSponsored() {
        return fundsSponsored;
    }

    public void setFundsSponsored(String fundsSponsored) {
        this.fundsSponsored = fundsSponsored;
    }

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String charityName) {
        this.charityName = charityName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Date getDateAcknowledged() {
        return dateAcknowledged;
    }

    public void setDateAcknowledged(Date dateAcknowledged) {
        this.dateAcknowledged = dateAcknowledged;
    }
    
    @Override
    public String toString()
    {
        return patientName;
    }
}
