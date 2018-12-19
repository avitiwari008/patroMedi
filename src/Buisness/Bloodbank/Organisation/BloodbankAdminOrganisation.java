/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Bloodbank.Organisation;

import Buisness.Bloodbank.Role.BloodbankAdminRole;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Business.Hospital.Role.DoctorRole;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class BloodbankAdminOrganisation extends Organisation {

    public BloodbankAdminOrganisation() {
        super(Organisation.Type.BloodbankAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodbankAdminRole());
        return roles;
    }

    
}
