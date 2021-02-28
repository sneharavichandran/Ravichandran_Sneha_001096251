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
public class House{
    
    double housenumber;
    String streetname;
    private Person person;

    public double getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(double housenumber) {
        this.housenumber = housenumber;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
}
