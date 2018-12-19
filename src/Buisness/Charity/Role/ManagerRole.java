/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Charity.Role;

import Buisness.Charity.Organisation.ManagerOrganisation;
import Buisness.EcoSystem;
import Buisness.Enterprise.CharityEnterprise;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Buisness.UserAccount.UserAccount;
import UserInterface.CharityManager.ManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author manor
 */
public class ManagerRole extends Role 
{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network,EcoSystem system) {
        return new ManagerWorkAreaJPanel(userProcessContainer,account,(ManagerOrganisation) organisation,(CharityEnterprise) enterprise,network,system);
    }
}