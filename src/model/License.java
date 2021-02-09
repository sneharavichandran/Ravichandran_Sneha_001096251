/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author sneha
 */
public class License {
    private String licenseno;
    private String doi;
    private String doe;
    private String bloodtype;
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    

    public String getLicenseno() {
        return licenseno;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }
   
    
}
