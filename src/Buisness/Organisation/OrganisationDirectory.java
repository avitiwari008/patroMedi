/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organisation;

import Buisness.Bloodbank.Organisation.BloodbankAdminOrganisation;
import Buisness.Bloodbank.Organisation.InchargeOrganisation;
import Buisness.Charity.Organisation.CharityAdminOrganisation;
import Buisness.Charity.Organisation.ManagerOrganisation;
import Buisness.Charity.Organisation.VolunteerOrganisation;
import Buisness.Enterprise.CharityEnterprise;
import Buisness.Organisation.Organisation.Type;
import Buisness.User.Organisation.DonorOrganisation;
import Buisness.User.Organisation.PatientOrganisation;
import Buisness.UserAccount.UserAccount;
import Business.Hospital.Organisation.DoctorOrganisation;
import Business.Hospital.Organisation.HospitalAdminOrganisation;
import Business.Hospital.Organisation.NurseOrganisation;
import Business.Hospital.Organisation.ReceptionistOrganisation;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class OrganisationDirectory {
     private ArrayList<Organisation> organisationList;

    public OrganisationDirectory() {
        organisationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganizationList() {
        return organisationList;
    }
    
    
     
    
    public Organisation createOrganisation(Type type){
        Organisation organisation = null;
        if (type.getValue().equals(Type.Doctor.getValue()))
        {
            organisation = new DoctorOrganisation();
            organisationList.add(organisation);
        }
        
        else if (type.getValue().equals(Type.Patient.getValue()))
        {
            organisation = new PatientOrganisation();
            organisationList.add(organisation);
        }
        
        else if(type.getValue().equals(Type.Donor.getValue()))
        {
            organisation = new DonorOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.HospitalAdmin.getValue()))
        {
            organisation = new HospitalAdminOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Receptionist.getValue()))
        {
            organisation = new ReceptionistOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Nurse.getValue()))
        {
            organisation = new NurseOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodbankAdmin.getValue()))
        {
            organisation = new BloodbankAdminOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodBankIncharge.getValue()))
        {
            organisation = new InchargeOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.CharityAdmin.getValue()))
        {
            organisation = new CharityAdminOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Volunteer.getValue()))
        {
            organisation = new VolunteerOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Manager.getValue()))
        {
            organisation = new ManagerOrganisation();
            organisationList.add(organisation);
        }
        
        
// else if other orgs
        return organisation;
    }
}
