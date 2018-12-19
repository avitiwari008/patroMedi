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
import UserInterface.Donor.DonorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sarthakgoel
 */
public class DonorRole extends Role{

    @Override

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation,Enterprise enterprise,Network network ,EcoSystem system) {
        return new DonorWorkAreaJPanel(userProcessContainer,account ,system); //To change body of generated methods, choose Tools | Templates.

    }
    
}
