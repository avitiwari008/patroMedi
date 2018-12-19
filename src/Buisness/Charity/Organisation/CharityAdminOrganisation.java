/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Charity.Organisation;

import Buisness.Charity.Role.CharityAdminRole;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class CharityAdminOrganisation extends Organisation {

    public CharityAdminOrganisation() {
        super(Organisation.Type.CharityAdmin.getValue());
    }
   

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CharityAdminRole());
        return roles;
    }
    
}
