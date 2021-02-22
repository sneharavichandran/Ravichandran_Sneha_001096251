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
    boolean isThisVitalSignNormal(String s, Vitalsigns v)
    {
     
        if (s.equals("Respiratory rate"))
        {
             if (age>=0 && age<=0.1)
             {
                 if(v.getRespiratoryrate()>=30 && v.getRespiratoryrate()<=50)
                 return true;
             }
             else if (age>0.1 && age<=1)
             {
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 return true;
             }
             else if (age>1 && age<=3)
             {
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 return true;
             }
             else if (age>3 && age<6)
             {
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 return true;
             }
             else if (age>=6 && age<13)
             {
                 System.out.println("Im inside");
                 if(v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
                 {
                     System.out.println("Im inside inside");
                 return true;
                 }
             }
             else if (age>=13)
             {
                 if(v.getRespiratoryrate()>=12 && v.getRespiratoryrate()<=20)
                 return true;
             }
             
        }
        if (s.equals("Heart rate"))
        {
             if (age>=0 && age<=0.1)
             {
                 if(v.getHeartrate()>=120 && v.getHeartrate()<=160)
                 return true;
             }
             else if (age>0.1 && age<=1)
             {
                 if(v.getHeartrate()>=80 && v.getHeartrate()<=140)
                 return true;
             }
             else if (age>1 && age<=3)
             {
                 if(v.getHeartrate()>=80 && v.getHeartrate()<=130)
                 return true;
             }
             else if (age>3 && age<6)
             {
                 if(v.getHeartrate()>=80 && v.getHeartrate()<=120)
                 return true;
             }
             else if (age>=6 && age<13)
             {
                 if(v.getHeartrate()>=70 && v.getHeartrate()<=110)
                 return true;
             }
             else if (age>=13)
             {
                 if(v.getHeartrate()>=55 && v.getHeartrate()<=105)
                 return true;
             }
             
        }
        if (s.equals("Systolic blood pressure"))
        {
             if (age>=0 && age<=0.1)
             {
                 if(v.getSystolicbp()>=50 && v.getSystolicbp()<=70)
                 return true;
             }
             else if (age>0.1 && age<=1)
             {
                 if(v.getSystolicbp()>=70 && v.getSystolicbp()<=100)
                 return true;
             }
             else if (age>1 && age<=3)
             {
                 if(v.getSystolicbp()>=80 && v.getSystolicbp()<=110)
                 return true;
             }
             else if (age>3 && age<6)
             {
                 if(v.getSystolicbp()>=80 && v.getSystolicbp()<=110)
                 return true;
             }
             else if (age>=6 && age<13)
             {
                 if(v.getSystolicbp()>=80 && v.getSystolicbp()<=120)
                 return true;
             }
             else if (age>=13)
             {
                 if(v.getSystolicbp()>=110 && v.getSystolicbp()<=120)
                 return true;
             }
             
        }
        if (s.equals("Weight kg"))
        {
             if (age>=0 && age<=0.1)
             {
                 if(v.getWeightk()>=2 && v.getWeightk()<=3)
                 return true;
             }
             else if (age>0.1 && age<=1)
             {
                 if(v.getWeightk()>=4 && v.getWeightk()<=10)
                 return true;
             }
             else if (age>1 && age<=3)
             {
                 if(v.getWeightk()>=10 && v.getWeightk()<=14)
                 return true;
             }
             else if (age>3 && age<6)
             {
                 if(v.getWeightk()>=14 && v.getWeightk()<=18)
                 return true;
             }
             else if (age>=6 && age<13)
             {
                 if(v.getWeightk()>=20 && v.getWeightk()<=42)
                 return true;
             }
             else if (age>=13)
             {
                 if(v.getWeightk()>=50)
                 return true;
             }
             
        }
        if (s.equals("Weight pounds"))
        {
             if (age>=0 && age<=0.1)
             {
                 if(v.getWeightp()>=4.5 && v.getWeightp()<=7)
                 return true;
             }
             else if (age>0.1 && age<=1)
             {
                 if(v.getWeightp()>=9 && v.getWeightp()<=22)
                 return true;
             }
             else if (age>1 && age<=3)
             {
                 if(v.getWeightp()>=22 && v.getWeightp()<=31)
                 return true;
             }
             else if (age>3 && age<6)
             {
                 if(v.getWeightp()>=31 && v.getWeightp()<=40)
                 return true;
             }
             else if (age>=6 && age<13)
             {
                 if(v.getWeightp()>=41 && v.getWeightp()<=92)
                 return true;
             }
             else if (age>=13)
             {
                 if(v.getWeightp()>=110)
                 return true;
             }
             
        }
        
        return false;
        
    }
    boolean PatientNormal(Vitalsigns v)
    {
        
        if (age>=0 && age<=0.1)
       {
           if (v.getRespiratoryrate()>=30  && v.getRespiratoryrate()<=50)
           {
               if (v.getHeartrate()>=120 && v.getHeartrate()<=160)
               {
                   if(v.getSystolicbp()>=50 && v.getSystolicbp()<=70)
                   {
                       if( v.getWeightk()>=2 && v.getWeightk()<=3)
                       {
                           if( v.getWeightp()>=4.5 && v.getWeightp()<=7)
                           {
                           return true;
                           }
                       }
                   }
               }
           }
       }
         if (age>0.1 && age<=1)
       {
           if (v.getRespiratoryrate()>=20  && v.getRespiratoryrate()<=30)
           {
               if (v.getHeartrate()>=80 && v.getHeartrate()<=140)
               {
                   if(v.getSystolicbp()>=70 && v.getSystolicbp()<=100)
                   {
                       if( v.getWeightk()>=4 && v.getWeightk()<=10)
                       {
                           if( v.getWeightp()>=9 && v.getWeightp()<=22)
                           {
                           return true;
                           }
                       }
                   }
               }
           }
       }
       
          if (age>1 && age<=3)
       {
           if (v.getRespiratoryrate()>=20  && v.getRespiratoryrate()<=30)
           {
               if (v.getHeartrate()>=80 && v.getHeartrate()<=130)
               {
                   if(v.getSystolicbp()>=80 && v.getSystolicbp()<=110)
                   {
                       if( v.getWeightk()>=10 &&v.getWeightk()<=14)
                       {
                           if( v.getWeightp()>=22 &&v.getWeightp()<=31)
                           {
                           return true;
                           }
                       }
                   }
               }
           }
       }
           if (age>3 && age<6 )
       {
           if (v.getRespiratoryrate()>=20  && v.getRespiratoryrate()<=30)
           {
               if (v.getHeartrate()>=80 && v.getHeartrate()<=120)
               {
                   if(v.getSystolicbp()>=80 && v.getSystolicbp()<=110)
                   {
                       if( v.getWeightk()>=14 &&v.getWeightk()<=18)
                       {
                           if( v.getWeightp()>=31 &&v.getWeightp()<=40)
                           {
                           return true;
                           }
                       }
                   }
               }
           }
       }
           if (age>=6 && age<13 )
       {
           if (v.getRespiratoryrate()>=20 && v.getRespiratoryrate()<=30)
           {
               if (v.getHeartrate()>=70 && v.getHeartrate()<=110)
               {
                   if(v.getSystolicbp()>=80 && v.getSystolicbp()<=120)
                   {
                       if( v.getWeightk()>=20 &&v.getWeightk()<=42)
                       {
                           if( v.getWeightp()>=41 &&v.getWeightp()<=92)
                           {
                           return true;
                           }
                       }
                   }
               }
           }
       }
        if (age>=13)
       {
           if (v.getRespiratoryrate()>=12  && v.getRespiratoryrate()<=20)
           {
               if (v.getHeartrate()>=55 && v.getHeartrate()<=105)
               {
                   if(v.getSystolicbp()>=110 && v.getSystolicbp()<=120)
                   {
                       if( v.getWeightk()>50)
                       {
                           if( v.getWeightp()>110)
                           {
                           return true;
                           }
                       }
                   }
               }
           }
       }
       return false;
         
    }
    
}
