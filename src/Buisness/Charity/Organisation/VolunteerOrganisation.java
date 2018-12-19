/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Charity.Organisation;

import Buisness.Charity.Role.VolunteerRole;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class VolunteerOrganisation extends Organisation{

    public VolunteerOrganisation() {
        super(Organisation.Type.Volunteer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VolunteerRole());
        return roles;
    }
    
}
