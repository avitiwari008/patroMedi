/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Organisation;

import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Business.Hospital.Role.DoctorRole;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class DoctorOrganisation extends Organisation {
    public DoctorOrganisation() {
        super(Organisation.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
}
