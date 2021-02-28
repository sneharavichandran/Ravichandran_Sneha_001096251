/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.lang.System;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author sneha
 */
public class Test {

    public static void main(String args[]) throws IOException {
        int inputPatientLoop = 1, inputChoiceLoop = 1;

        //boolean value;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ArrayList<Patient> patientList = new ArrayList<>();
        PatientDirectory patientDirectory = new PatientDirectory();
        PersonDirectory personDirectory = new PersonDirectory();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Patient patient = new Patient();

        while (inputChoiceLoop > 0) {
            System.out.println("Please enter your choice : \n"
                    + "Press 1 if you want to enter patient details. \n"
                    + "Press 2 if you want to find out if a patient's given vital sign is in normal range? \n"
                    + "Press 3 if you want to find out if a patient's vital signs are in normal range? \n"
                    + "Press 4 if you want to add vital signs for an existing patient. \n"
                    + "Press 5 if you want to generate a report to print out the number of cases for each community");

            try {
                switch (Integer.parseInt(bufferedReader.readLine())) {
                    case 1:
                        System.out.println("You have chosen to enter the patient details");
                        while (inputPatientLoop > 0) {
                            System.out.println("Do you want to enter new patient details? Enter Y for Yes (or) N for No");
                            String patientInput = bufferedReader.readLine();
                            if ("n".startsWith(patientInput) || "N".startsWith(patientInput)) {
                                break;
                            } else if ("Y".startsWith(patientInput) || "y".startsWith(patientInput)) {
                                patient = new Patient();
                                System.out.println("Enter Patient's first name");
                                patient.setFirstname(bufferedReader.readLine());
                                System.out.println("Enter Patient's last name");
                                patient.setLastname(bufferedReader.readLine());
                                System.out.println("Enter Patient's age( for newborn=0, infant=0.11 above ,toddler 1-3)");
                                /**
                                 * if(parseInt(br.readLine())<0) { exit(0); }*
                                 */
                                try {
                                    patient.setAge(Double.parseDouble(bufferedReader.readLine()));
                                    if (0 > patient.age) {
                                        System.out.println("Age cannot be negative");
                                        continue;
                                    }
                                } catch (NumberFormatException nfe) {
                                    System.out.println("Age cannot contain non-numeric characters");
                                    patient.setAge(Double.parseDouble(bufferedReader.readLine()));
                                }

                                House house = new House();
                                System.out.println("Enter the house #");
                                house.setHousenumber(Integer.parseInt(bufferedReader.readLine()));
                                System.out.println("Enter the street name ");
                                house.setStreetname((bufferedReader.readLine()));
                                patient.setHouse(house);

                                Community community = new Community();
                                System.out.println("Enter the community name");
                                community.setCommunityName(bufferedReader.readLine());
                                patient.setCommunity(community);

                                City city = new City();
                                System.out.println("Enter the City name");
                                city.setCity(bufferedReader.readLine());
                                patient.setCity(city);

                                VitalSigns vitalSigns = new VitalSigns();
                                System.out.println("Enter Patient's Respiratory rate");
                                vitalSigns.setRespiratoryrate(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's heart rate");
                                vitalSigns.setHeartrate(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's systolic blood pressure");
                                vitalSigns.setSystolicbp(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's weight in kg");
                                vitalSigns.setWeightk(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's weight in pounds");
                                vitalSigns.setWeightp(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println(dateTimeFormatter.format(now));
                                vitalSigns.setTimestamp(now);
                                patient.setVitalSigns(vitalSigns);
                            } else {
                                System.out.println("Invalid Input");
                                continue;
                            }
                            patientDirectory.addPatientList(patient);
                            personDirectory.addPersonList(patient);
                        }
                        break;
                    case 2:
                        System.out.println("You have chosen to input a vital sign and find out if the patient's vital sign is in normal range.");
                        System.out.println("Please input the patient's full name.");
                        String vitalsPatientNameInput = bufferedReader.readLine();
                        System.out.println("Name of the patient you have entered is: \t" + vitalsPatientNameInput);
                        for (Patient patientFromList : patientDirectory.getPatientList()) {
                            System.out.println("*****************************");
                            if (vitalsPatientNameInput.equalsIgnoreCase(patientFromList.getFirstname() + " " + patientFromList.getLastname())) {
                                System.out.println("Record found..............");
                                System.out.println("--------------------------");
                                System.out.println("Printing patient details..");
                                System.out.println("--------------------------");
                                System.out.println(" Current vitals");
                                System.out.println("--------------------------");
                                printVitals(patientFromList.getVitalSigns());
                                System.out.println("--------------------------");
                            }
                        }
                        System.out.println("Now please input a vital sign # from the following list (simply enter the number given against the vital sign of your choice) \n"
                                + "1. Respiratory rate \n"
                                + "2. Heart rate \n"
                                + "3. Systolic blood pressure \n"
                                + "4. Weight (Kgs) \n"
                                + "5. Weight (pounds)");
                        String vitalInput = bufferedReader.readLine();
                        try {

                            switch (Integer.parseInt(vitalInput)) {
                                case 1:
                                    vitalInput = "Respiratory rate";
                                    break;
                                case 2:
                                    vitalInput = "Heart rate";
                                    break;
                                case 3:
                                    vitalInput = "Systolic blood pressure";
                                    break;
                                case 4:
                                    vitalInput = "Weight kg";
                                    break;
                                case 5:
                                    vitalInput = "Weight pounds";
                                    break;
                                default:
                                    break;
                            }
                        } catch (NumberFormatException nfe) {
                            System.out.println("Invalid input");
                        }

                        System.out.println(vitalInput + " Vital sign status: " + patient.isThisVitalSignNormal(vitalInput, patient.getVitalSigns()));
                        break;
                    case 3:
                        System.out.println("You have chosen to find out if the patient's vital signs are in normal range.");
                        System.out.println("Please input the patient's full name.");
                        String patientNameInput = bufferedReader.readLine();
                        System.out.println("Name of the patient you have entered is: \t\t\t" + patientNameInput);
                        for (Patient patientFromList : patientDirectory.getPatientList()) {
                            System.out.println("*****************************");
                            if (patientNameInput.equalsIgnoreCase(patientFromList.getFirstname() + " " + patientFromList.getLastname())) {
                                System.out.println("Record found..............");
                                System.out.println("--------------------------");
                                System.out.println("Printing patient details..");
                                System.out.println("--------------------------");
                                System.out.println(" Current vitals");
                                System.out.println("--------------------------");
                                printVitals(patientFromList.getVitalSigns());
                                System.out.println("--------------------------");
                                System.out.println("Status... " + patient.isPatientNormal(patientFromList.getVitalSigns()));
                            }
                        }
                        break;
                    case 4:
                        System.out.println("You have chosen to add vital signs for an existing patient.");
                        System.out.println("Please input the patient's full name.");
                        String existingPatientNameInput = bufferedReader.readLine();
                        System.out.println("Name of the patient you have entered is: \t\t\t" + existingPatientNameInput);
                        for (Patient patientFromList : patientDirectory.getPatientList()) {
                            System.out.println("*****************************");
                            if (existingPatientNameInput.equalsIgnoreCase(patientFromList.getFirstname() + " " + patientFromList.getLastname())) {
                                System.out.println("Record found..............");
                                VitalSigns vitalSigns = new VitalSigns();
                                System.out.println("Enter Patient's Respiratory rate");
                                vitalSigns.setRespiratoryrate(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's heart rate");
                                vitalSigns.setHeartrate(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's systolic blood pressure");
                                vitalSigns.setSystolicbp(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's weight in kg");
                                vitalSigns.setWeightk(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Enter Patient's weight in pounds");
                                vitalSigns.setWeightp(Double.parseDouble(bufferedReader.readLine()));
                                System.out.println("Record entry time\t" + dateTimeFormatter.format(now));
                                vitalSigns.setTimestamp(now);
                                patientFromList.setVitalSigns(vitalSigns);
                                break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("to generate a report to print out the number of cases for each community.");
                        HashMap communityMap = new HashMap();
                        int communityCount = 0;
                        System.out.println(patientDirectory.getPatientList().size());
                        for (Patient communityPatient : patientDirectory.getPatientList()) {
                            if (communityPatient.isThisVitalSignNormal(communityPatient) == false) {
                                if (communityMap.get(communityPatient.getCommunity().getCommunityName()) != null
                                        && !"".equals(communityPatient.getCommunity().getCommunityName())) {
                                    communityCount += Integer.parseInt(communityMap.get(communityPatient.getCommunity().getCommunityName()).toString());
                                } else {
                                    communityCount = 1;
                                }
                                communityMap.put(communityPatient.getCommunity().getCommunityName(), communityCount);
                                System.out.println(communityMap);
                            }
                        }
                        TreeMap sortedCommunity = new TreeMap<>(communityMap);
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
            }
        }

    }

    public static void printVitals(VitalSigns v) {
        System.out.println("Respiratory rate " + v.getRespiratoryrate());
        System.out.println("Heart rate " + v.getHeartrate());
        System.out.println("Systolic blood pressure " + v.getSystolicbp());
        System.out.println("Weight in kg " + v.getWeightk());
        System.out.println("Weight in pounds " + v.getWeightp());
        System.out.println("Date/Time Entered" + v.getTimestamp());
    }

}
