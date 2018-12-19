/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import Buisness.Network.Network;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Buisness.UserInfo.PatientDirectory;
import Buisness.UserInfo.DonorDirectory;
import Business.Hospital.Appointment.AppointmentDirectory;
import Business.Charity.Donation.DonationDirectory;
import java.util.ArrayList;

/**
 *
 * @author SarthakGoel
 */
public class EcoSystem extends Organisation
{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PatientDirectory patientDir;
    private DonorDirectory donorDir;
    private AppointmentDirectory appointmentDirectory;
    private DonationDirectory donationDirectory;
    
    public static EcoSystem getInstance()
    {
        if(business==null)
        {
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork()
    {
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    private EcoSystem()
    {
        super(null);
        networkList=new ArrayList<>();
        this.patientDir = new PatientDirectory();
        this.donorDir = new DonorDirectory();
        this.appointmentDirectory = new AppointmentDirectory();
        this.donationDirectory = new DonationDirectory();
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }

    public DonationDirectory getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(DonationDirectory donationDirectory) {
        this.donationDirectory = donationDirectory;
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }

    public DonorDirectory getDonorDir() {
        return donorDir;
    }

    public void setDonorDir(DonorDirectory donorDir) {
        this.donorDir = donorDir;
    }

    public ArrayList<Network> getNetworkList() 
    {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) 
    {
        this.networkList = networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
