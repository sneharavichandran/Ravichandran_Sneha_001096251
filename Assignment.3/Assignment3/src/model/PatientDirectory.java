/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sneha
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList = new ArrayList<Patient>();

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void addPatientList(Patient patient) {
        this.patientList.add(patient);
    }
    
    
    
}
