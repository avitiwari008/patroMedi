/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Bloodbank.Organisation;

import Buisness.Bloodbank.Inventory.BloodBankInventoryDirectory;
import Buisness.Bloodbank.Role.BloodbankInchargeRole;
import Buisness.Organisation.Organisation;
import Buisness.Role.Role;
import Buisness.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aviti
 */
public class InchargeOrganisation extends Organisation {
   private BloodBankInventoryDirectory bbinventoryDirectory;
    public InchargeOrganisation() {
        super(Organisation.Type.BloodBankIncharge.getValue());
        bbinventoryDirectory= new BloodBankInventoryDirectory();
       
    }

    public BloodBankInventoryDirectory getBbinventoryDirectory() {
        return bbinventoryDirectory;
    }

    public void setBbinventoryDirectory(BloodBankInventoryDirectory bbinventoryDirectory) {
        this.bbinventoryDirectory = bbinventoryDirectory;
    }
        
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodbankInchargeRole());
        return roles;
    }
    
}
