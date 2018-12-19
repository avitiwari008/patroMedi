/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.UserInfo;

import Buisness.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author sarthakgoel
 */
public class PatientDirectory 
{
    private ArrayList<PatientInfo> patientDirectory;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public PatientDirectory()
    {
        this.patientDirectory = new ArrayList<PatientInfo>();
        this.workQueue = new WorkQueue();
    }

    public ArrayList<PatientInfo> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<PatientInfo> patientDirectory) 
    {
        this.patientDirectory = patientDirectory;
    }
    
    public PatientInfo addPatient()
    {
        PatientInfo patient = new PatientInfo();
        patientDirectory.add(patient);
        return patient;
    }
    public void deletePatient(PatientInfo patient)
    {
        patientDirectory.remove(patient);
    }
    
}
