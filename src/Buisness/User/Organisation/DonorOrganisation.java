/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.User.Organisation;

import Buisness.Organisation.Organisation;
import Buisness.Role.DonorRole;
import Buisness.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sarthak Goel
 */
public class DonorOrganisation extends Organisation
{
    public DonorOrganisation() 
    {
        super(Organisation.Type.Donor.getValue());
    }

    @Override
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorRole());
        return roles;
    }
}
