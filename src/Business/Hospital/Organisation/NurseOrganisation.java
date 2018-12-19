/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Organisation;

import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Buisness.WorkQueue.WorkQueue;
import Business.Hospital.Role.NurseRole;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class NurseOrganisation extends Organisation {

    private WorkQueue doctorNurseWQ;
    private WorkQueue BloodInchargeNurseWQ;
    public NurseOrganisation() {
        super(Organisation.Type.Nurse.getValue());
        doctorNurseWQ = new WorkQueue();
        BloodInchargeNurseWQ= new WorkQueue();
    }

    public WorkQueue getBloodInchargeNurseWQ() {
        return BloodInchargeNurseWQ;
    }

    public void setBloodInchargeNurseWQ(WorkQueue BloodInchargeNurseWQ) {
        this.BloodInchargeNurseWQ = BloodInchargeNurseWQ;
    }

    

    public WorkQueue getDoctorNurseWQ() {
        return doctorNurseWQ;
    }

    public void setDoctorNurseWQ(WorkQueue doctorNurseWQ) {
        this.doctorNurseWQ = doctorNurseWQ;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }
    
}
