/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sneha
 */
public class Person {
    
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String dob;
    private String age;
    private String height;
    private String weight;
    private String ssn;
    Address workaddress;
    Account checkingaccount;
    Account savingaccount;
    License driverlicense;
    Medical medicalreport;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public Account getCheckingaccount() {
        return checkingaccount;
    }

    public void setCheckingaccount(Account checkingaccount) {
        this.checkingaccount = checkingaccount;
    }

    public Account getSavingaccount() {
        return savingaccount;
    }

    public void setSavingaccount(Account savingaccount) {
        this.savingaccount = savingaccount;
    }

    public License getDriverlicense() {
        return driverlicense;
    }

    public void setDriverlicense(License driverlicense) {
        this.driverlicense = driverlicense;
    }

    public Medical getMedicalreport() {
        return medicalreport;
    }

    public void setMedicalreport(Medical medicalreport) {
        this.medicalreport = medicalreport;
    }
    
   
    
}
