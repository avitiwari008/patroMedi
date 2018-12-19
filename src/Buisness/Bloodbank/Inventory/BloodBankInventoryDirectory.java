
package Buisness.Bloodbank.Inventory;

import Buisness.Bloodbank.Inventory.BloodBankInventory.Type1;
import java.util.ArrayList;

/**
 *
 * @author aviti
 */
public class BloodBankInventoryDirectory 
{
    private ArrayList<BloodBankInventory> inventory;
    
    public BloodBankInventoryDirectory()
    {
        this.inventory =new ArrayList<BloodBankInventory>();
    }

    public ArrayList<BloodBankInventory> getInventory() 
    {
        return inventory;
    }

    public void setInventory(ArrayList<BloodBankInventory> inventory) 
    {
        this.inventory = inventory;
    }
    
    public BloodBankInventory addBlood() 
    {
        BloodBankInventory b = new BloodBankInventory();
        inventory.add(b);
        return b;
    }
    
    public BloodBankInventory SearchBloodGroup(Type1 typ)
    {
        boolean result = true;
        for(BloodBankInventory b : this.inventory)
        {
            if(b.getBloodType() != null)
            {
                if(b.getBloodType().equals(typ.getValue()))
                {
                    result = false;
                    return b;
                }
                else
                {
                    result = true;
                }
            }    
            else
            {
                result = true;
            }
        }
        
        if(result == true)
        {
            BloodBankInventory bbi = addBlood();
            return bbi;
        }
        
        return null; 
    }
    
    public boolean checkBloodQuantity(String bloodGroup, int reqdBloodQuantity)
    {
        boolean output = false;
        
        for(BloodBankInventory bbi : this.inventory)
        {
            if(bbi.getBloodType().equalsIgnoreCase(bloodGroup))
            {
                int quantityAvailable = bbi.getBloodQuantity();
                
                if(quantityAvailable < reqdBloodQuantity )
                {
                    return false;
                }
                else
                {
                    quantityAvailable -= reqdBloodQuantity;
                    bbi.setBloodQuantity(quantityAvailable);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
}
