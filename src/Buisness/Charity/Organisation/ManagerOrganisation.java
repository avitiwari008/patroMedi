/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Charity.Organisation;

import Buisness.Charity.Role.ManagerRole;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class ManagerOrganisation extends Organisation{

    public ManagerOrganisation() {
        super(Organisation.Type.Manager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagerRole());
        return roles;
    }
    
}
