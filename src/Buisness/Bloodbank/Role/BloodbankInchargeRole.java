/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Bloodbank.Role;

import Buisness.Bloodbank.Organisation.InchargeOrganisation;
import Buisness.EcoSystem;
import Buisness.Enterprise.BloodbankEnterprise;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Buisness.UserAccount.UserAccount;
import UserInterface.BloodBank.BloodBankInchargeLandingJPanel;

import javax.swing.JPanel;

/**
 *
 * @author manor
 */
public class BloodbankInchargeRole extends Role {

    
    @Override
    public JPanel createWorkArea (JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem business) {
        return new BloodBankInchargeLandingJPanel(userProcessContainer,account,(InchargeOrganisation)organisation,(BloodbankEnterprise)enterprise,network,business);
    }
    
}
