/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Role;
import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Buisness.UserAccount.*;
import Business.Hospital.Organisation.DoctorOrganisation;
import UserInterface.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author manor
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem system) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(DoctorOrganisation) organisation,enterprise, system);
    }
    
    
    
    
}
