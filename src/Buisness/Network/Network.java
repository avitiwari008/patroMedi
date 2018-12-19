/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Network;

import Buisness.Enterprise.EnterpriseDirectory;
import Buisness.WorkQueue.WorkQueue;

/**
 *
 * @author manor
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private WorkQueue CharityRequests;
    private WorkQueue BloodBankRequests;
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        this.CharityRequests = new WorkQueue();
        this.BloodBankRequests = new WorkQueue();
    }

    public WorkQueue getCharityRequests() {
        return CharityRequests;
    }

    public void setCharityRequests(WorkQueue CharityRequests) {
        this.CharityRequests = CharityRequests;
    }

    public WorkQueue getBloodBankRequests() {
        return BloodBankRequests;
    }

    public void setBloodBankRequests(WorkQueue BloodBankRequests) {
        this.BloodBankRequests = BloodBankRequests;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}