/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

/**
 *
 * @author manor
 */
public class HospitalCharityRequestWorkQueue extends WorkRequest{
    private float amount;
    private String Message;
    private String PatientName;
    private String city;
    private String hospitalName;
    private String CharityName;

    public String getCharityName() {
        return CharityName;
    }

    public void setCharityName(String CharityName) {
        this.CharityName = CharityName;
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    
    @Override
    public String toString(){
        return this.PatientName;
    }
}
