/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import Buisness.Employee.Employee;
import Buisness.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author manor
 */
public class ReceptionistAddSlotsWorkQueue extends WorkRequest{
    private Date Slot;
    private String doctor;
    public String city;
    private String hospitalName;

    public ReceptionistAddSlotsWorkQueue() 
    {
       
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDoctor() 
    {
        return doctor;
    }
    
    public void setDoctor(String doctor) 
    {
        this.doctor = doctor;
    }
    
    public Date getSlot() {
        return Slot;
    }

    public void setSlot(Date Slot) {
        this.Slot = Slot;
    }
    @Override
    public String toString(){
        return this.hospitalName;
    }
}
