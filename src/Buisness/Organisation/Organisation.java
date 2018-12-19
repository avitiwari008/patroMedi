/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organisation;

import Buisness.Employee.EmployeeDirectory;
import Buisness.Role.Role;
import Buisness.UserAccount.UserAccountDirectory;
import Buisness.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author manor
 */
public abstract class Organisation {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        HospitalAdmin("Hospital Admin Organisation"), Doctor("Doctor Organisation"), Receptionist("Receptionist Organisation"),Nurse("Nurse Organisation"),
        Patient("Patient Organisation"),Donor("Donor Organisation"),
        CharityAdmin("Charity Admin Organisation"),Manager("Manager Organisation"),Volunteer("Volunteer Organisation"),
        BloodbankAdmin("BloodBank Admin Organisation"),BloodBankIncharge("BloodBankIncharge");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        public static Type getHospitalAdmin() {
            return HospitalAdmin;
        }

        public static Type getDoctor() {
            return Doctor;
        }

        public static Type getReceptionist() {
            return Receptionist;
        }

        public static Type getNurse() {
            return Nurse;
        }

        public static Type getPatient() {
            return Patient;
        }

        public static Type getDonor() {
            return Donor;
        }

        public static Type getCharityAdmin() {
            return CharityAdmin;
        }

        public static Type getManager() {
            return Manager;
        }

        public static Type getVolunteer() {
            return Volunteer;
        }

        public static Type getBloodbankAdmin() {
            return BloodbankAdmin;
        }

        public static Type getBloodBankIncharge() {
            return BloodBankIncharge;
        }
        
    }

    public Organisation(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}