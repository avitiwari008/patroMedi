/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Role;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organisation.Organisation;
import Buisness.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author manor
 */
public abstract class Role {
    public enum RoleType{
            Doctor("Doctor"),HospitalAdmin("HospitalAdmin"),Nurse("Nurse"),Receptionist("Receptionist"),
            Donor("Donor"),Patient("Patient"),
            CharityAdmin("CharityAdmin"),Manager("Manager"),Volunteer("Volunteer"),
            BloodbankAdmin("BloodbankAdmin"),BloodBankIncharge("BloodbankIncharge"),;
        private RoleType(String value){
            this.value = value;
        }
        private String value;
        
        @Override
        public String toString() {
            return value;
        }
        
        
    }
        public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organisation organisation, 
            Enterprise enterprise,
            Network network,
            EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}

