/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
/**
 *
 * @author sneha
 */
public class Vitalsigns {
   private double Respiratoryrate;
   private double Heartrate;
   private double Systolicbp;
   private double weightk;
   private double weightp;
   //private String timestamp;
   private LocalDateTime timestamp;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
   
   Patient p;
private int age;

   
    public double getRespiratoryrate() {
        return Respiratoryrate;
    }

    public void setRespiratoryrate(double Respiratoryrate) {
        this.Respiratoryrate = Respiratoryrate;
    }

    public double getHeartrate() {
        return Heartrate;
    }

    public void setHeartrate(double Heartrate) {
        this.Heartrate = Heartrate;
    }

    public double getSystolicbp() {
        return Systolicbp;
    }

    public void setSystolicbp(double Systolicbp) {
        this.Systolicbp = Systolicbp;
    }

    public double getWeightk() {
        return weightk;
    }

    public void setWeightk(double weightk) {
        this.weightk = weightk;
    }

    public double getWeightp() {
        return weightp;
    }

    public void setWeightp(double weightp) {
        this.weightp = weightp;
    }
  
    
}
