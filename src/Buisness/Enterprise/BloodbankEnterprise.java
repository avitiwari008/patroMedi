/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Enterprise;

import Buisness.Bloodbank.Inventory.BloodBankInventoryDirectory;
import Buisness.Role.Role;
import Buisness.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class BloodbankEnterprise extends Enterprise{

    private BloodBankInventoryDirectory bbinventoryDirectory;
    
    public BloodbankEnterprise(String name){
        super(name,EnterpriseType.Bloodbank);
        bbinventoryDirectory= new BloodBankInventoryDirectory();
    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
