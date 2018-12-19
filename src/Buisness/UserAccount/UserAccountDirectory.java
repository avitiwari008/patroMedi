/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.UserAccount;

import Buisness.Employee.Employee;
import Buisness.Role.*;
import Buisness.UserInfo.DonorInfo;
import Buisness.UserInfo.PatientInfo;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    public void deleteUser(String username){
        for(UserAccount u :userAccountList){
            if(u.getUsername().equals(username))
            {
                userAccountList.remove(u);
                break;
            }
        }
    }
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createPatientAccount(String username, String password, PatientInfo patient, Role role)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPatient(patient);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createDonorAccount(String username, String password, DonorInfo donor, Role role)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setDonor(donor);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

}
