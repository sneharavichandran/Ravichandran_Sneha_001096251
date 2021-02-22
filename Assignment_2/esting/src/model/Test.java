/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import static java.lang.Integer.parseInt;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

/**
 *
 * @author sneha
 */
public class Test {
    public static void printVitals(Vitalsigns v)
    {
        System.out.println("Respiratory rate"+v.getRespiratoryrate());
        System.out.println("Heart rate"+v.getHeartrate());
        System.out.println("Systolic blood pressure"+v.getSystolicbp());
        System.out.println("Weight in kg"+v.getWeightk());
        System.out.println("Time stamp"+v.getTimestamp());
    }
    public static void main(String args[]) throws IOException {
        int i=1,j=1;
        boolean value;
        InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);  
  ArrayList <Patient> pa= new ArrayList<>();
 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
  
        while(i>0)
    {
        System.out.println("Do you want to enter new patient details? y/n");
        String counter=br.readLine();
        if("n".equals(counter))
        {
            break;
            
        }
        Patient p= new Patient();
        System.out.println("Enter Patient's first name");
        p.setFirstname(br.readLine());
        System.out.println("Enter Patient's last name");
        p.setLastname(br.readLine());
        System.out.println("Enter Patient's age newborn=0, infant=0.5 above,toddler 1-3");
        /**if(parseInt(br.readLine())<0)
        {
            exit(0);
        }**/
        p.setAge(Double.parseDouble ( br.readLine() ));
        if (p.age<0)
        {
            System.out.println("Age cannot be negative");
            continue;
        }
        while(j>0)
        {
            Vitalsigns cur=new Vitalsigns();
       
        System.out.println("Enter Patient's Respiratory rate");
        cur.setRespiratoryrate(parseInt(br.readLine()));
        System.out.println("Enter Patient's heart rate");
        cur.setHeartrate(parseInt(br.readLine()));
        System.out.println("Enter Patient's systolic blood pressure");
        cur.setSystolicbp(parseInt(br.readLine()));
        System.out.println("Enter Patient's weight in kg");
        cur.setWeightk(parseInt(br.readLine()));
         System.out.println(dtf.format(now)); 
         cur.setTimestamp(now);
        p.newVitalSign(cur);
        System.out.println("do you want to enter new vitals for the same patient?y/n");
        String counter1=br.readLine();
        if("n".equals(counter1))
        {
            break;
            
        }
        }
        pa.add(p);
        System.out.println("do you want to input a vital sign and find out if the patient's range is normal?y/n");
        String counter2=br.readLine();
        if("y".equals(counter2))
        {
            System.out.println("Please input a vital sign name");
            String counter3=br.readLine();
            System.out.println(p.isThisVitalSignNormal(counter3));
            
        }
        //value=p.PatientNormal();
        //System.out.println(value);
        
    }
        int num=1;
        for (Patient p: pa)
        {
            System.out.println("*****************************");
            System.out.println(" Current vitals");
            System.out.println("Patient name "+ p.getFirstname()+ p.getLastname());
            printVitals(p.getCurrent());
           System.out.println("Current vitals status "+ p.PatientNormal(p.getCurrent()));
           ArrayList <Vitalsigns> vlist=p.getVitals();
           for(Vitalsigns v: vlist)
           {
               System.out.println("Vital sign history "+num);
               System.out.println("Respiratory rate "+v.getRespiratoryrate());
               System.out.println("Heart rate "+v.getHeartrate());
               System.out.println("Systolicbp "+v.getSystolicbp());
               System.out.println("Weight in kg's "+v.getWeightk());
               System.out.println("Timestamp "+v.getTimestamp());
               num++;
           }
        }   
    }    
}
