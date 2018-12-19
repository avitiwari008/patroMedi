/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import Buisness.Employee.Employee;
import Buisness.Role.SystemAdminRole;
import Buisness.UserAccount.UserAccountDirectory;
import Buisness.UserAccount.UserAccount;

/**
 *
 * @author manor
 */
public class ConfigureASystem 
{
    public static EcoSystem configure()
    {    
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee,new SystemAdminRole());
        
        return system;
    }
}
