/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class Patient {
    private String Firstname;
    private String Lastname;
    int k=0;
    double age;
    Vitalsigns v;
    ArrayList <Vitalsigns> vitals=new ArrayList <Vitalsigns>();
    Vitalsigns current;
    //vitals= new ArrayList <Vitalsigns>();

    public ArrayList<Vitalsigns> getVitals() {
        return vitals;
    }

   

    public Vitalsigns getCurrent() {
        return current;
    }

    public void setCurrent(Vitalsigns current) {
        this.current = current;
    }
    public Patient()
    {
        v = new Vitalsigns();
    }
    public Vitalsigns getV()
    {
        return v;
    }
   
    public double getAge() {
        
        return age;
        
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }
  
    public void newVitalSign(Vitalsigns v)
    {
        
        if (vitals.isEmpty() && k==0)
        {
            this.current=v;
            k=1;
            //System.out.println("its empty");
        }
        else{
            vitals.add(this.current);
            this.current=v;
        }
    }
    boolean isThisVitalSignNormal(String s)
    {
     
        if (s.equals("Respiratory rate"))
        {
             if (age>0 && age<=0.5)
             {
                 if(v.getRespiratoryrate()>=30 && v.getRespiratoryrate()<=50)
                 return true;
             }
             if (age>0.5 && age<=1)
             {
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 return true;
             }
             if (age>1 && age<=3)
             {
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 return true;
             }
             if (age>3 && age<6)
             {
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 return true;
             }
             if (age>=6 && age<13)
             {
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 return true;
             }
             if (age>=13)
             {
                 if(v.getRespiratoryrate()>=12 && v.getRespiratoryrate()<=20)
                 return true;
             }
             
        }
        if (s.equals("Heart rate"))
        {
             if (age>0 && age<=0.5)
             {
                 if(v.getHeartrate()>=30 && v.getHeartrate()<=50)
                 return true;
             }
             else if (age>0.5 && age<=1)
             {
                 if(v.getHeartrate()>=20 && v.getHeartrate()<=30)
                 return true;
             }
             else if (age>1 && age<=3)
             {
                 if(v.getHeartrate()>=20 && v.getHeartrate()<=30)
                 return true;
             }
             else if (age>3 && age<6)
             {
                 if(v.getHeartrate()>=20 && v.getHeartrate()<=30)
                 return true;
             }
             else if (age>=6 && age<13)
             {
                 if(v.getHeartrate()>=20 && v.getHeartrate()<=30)
                 return true;
             }
             else if (age>=13)
             {
                 if(v.getHeartrate()>=12 && v.getHeartrate()<=20)
                 return true;
             }
             
        }
        
        return false;
        
    }
    boolean PatientNormal(Vitalsigns v)
    {
        
        if (age>0 && age<=0.5)
       {
           if (v.getRespiratoryrate()>30  && v.getRespiratoryrate()<50)
           {
               if (v.getHeartrate()>120 && v.getHeartrate()<160)
               {
                   if(v.getSystolicbp()>50 && v.getSystolicbp()<70)
                   {
                       if( v.getWeightk()>2 &&v.getWeightk()<3)
                       {
                           return true;
                       }
                   }
               }
           }
       }
         if (age>0.5 && age<=1)
       {
           if (v.getRespiratoryrate()>19  && v.getRespiratoryrate()<31)
           {
               if (v.getHeartrate()>79 && v.getHeartrate()<141)
               {
                   if(v.getSystolicbp()>69 && v.getSystolicbp()<101)
                   {
                       if( v.getWeightk()>4 &&v.getWeightk()<10)
                       {
                           return true;
                       }
                   }
               }
           }
       }
       
          if (age>1 && age<=3)
       {
           if (v.getRespiratoryrate()>19  && v.getRespiratoryrate()<31)
           {
               if (v.getHeartrate()>79 && v.getHeartrate()<131)
               {
                   if(v.getSystolicbp()>79 && v.getSystolicbp()<111)
                   {
                       if( v.getWeightk()>9 &&v.getWeightk()<15)
                       {
                           return true;
                       }
                   }
               }
           }
       }
           if (age>3 && age<6 )
       {
           if (v.getRespiratoryrate()>19  && v.getRespiratoryrate()<31)
           {
               if (v.getHeartrate()>79 && v.getHeartrate()<121)
               {
                   if(v.getSystolicbp()>79 && v.getSystolicbp()<111)
                   {
                       if( v.getWeightk()>13 &&v.getWeightk()<19)
                       {
                           return true;
                       }
                   }
               }
           }
       }
           if (age>=6 && age<13 )
       {
           if (v.getRespiratoryrate()>19  && v.getRespiratoryrate()<31)
           {
               if (v.getHeartrate()>69 && v.getHeartrate()<111)
               {
                   if(v.getSystolicbp()>79 && v.getSystolicbp()<121)
                   {
                       if( v.getWeightk()>19 &&v.getWeightk()<43)
                       {
                           return true;
                       }
                   }
               }
           }
       }
        if (age>=13)
       {
           if (v.getRespiratoryrate()>11  && v.getRespiratoryrate()<21)
           {
               if (v.getHeartrate()>54 && v.getHeartrate()<106)
               {
                   if(v.getSystolicbp()>109 && v.getSystolicbp()<121)
                   {
                       if( v.getWeightk()>49)
                       {
                           return true;
                       }
                   }
               }
           }
       }
       return false;
         
    }
    
}
