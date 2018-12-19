/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.UserAccount;

import Buisness.Employee.Employee;
import Buisness.Role.Role;
import Buisness.UserInfo.DonorInfo;
import Buisness.UserInfo.PatientInfo;
import Buisness.WorkQueue.WorkQueue;



/**
 *
 * @author manor
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private PatientInfo patient;
    private DonorInfo donor;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public PatientInfo getPatient() {
        return patient;
    }

    public void setPatient(PatientInfo patient) {
        this.patient = patient;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public DonorInfo getDonor() {
        return donor;
    }

    public void setDonor(DonorInfo donor) {
        this.donor = donor;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}