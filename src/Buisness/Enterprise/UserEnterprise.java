/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Enterprise;

import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class UserEnterprise extends Enterprise{
    public UserEnterprise(String name){
        super(name,EnterpriseType.User);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
