/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital.Organisation;

/**
 *
 * @author manor
 */
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Buisness.WorkQueue.WorkQueue;
import Business.Hospital.Role.ReceptionistRole;
import java.util.ArrayList;


public class ReceptionistOrganisation extends Organisation 
{
    private WorkQueue incomingPatients;
    private WorkQueue fundingQueue;
    private WorkQueue charityAcknowledgment;

    public WorkQueue getCharityAcknowledgment() {
        return charityAcknowledgment;
    }

    public void setCharityAcknowledgment(WorkQueue charityAcknowledgment) {
        this.charityAcknowledgment = charityAcknowledgment;
    }

    public WorkQueue getFundingQueue() {
        return fundingQueue;
    }

    public void setFundingQueue(WorkQueue fundingQueue) {
        this.fundingQueue = fundingQueue;
    }
    public WorkQueue getIncomingPatients() {
        return incomingPatients;
    }

    public void setIncomingPatients(WorkQueue incomingPatients) {
        this.incomingPatients = incomingPatients;
    }
    
    public ReceptionistOrganisation() {
        super(Organisation.Type.Receptionist.getValue());
        incomingPatients = new WorkQueue();
        fundingQueue = new WorkQueue();
        charityAcknowledgment = new WorkQueue();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionistRole());
        return roles;
    }   
}
