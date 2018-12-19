/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.User.Organisation;

import Buisness.Organisation.Organisation;
import Buisness.Role.PatientRole;
import Buisness.Role.Role;
import Business.Hospital.Role.DoctorRole;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sarthak Goel
 */
public class PatientOrganisation extends Organisation
{
        public PatientOrganisation()
    {
        super(Organisation.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        return roles;
    }
}
