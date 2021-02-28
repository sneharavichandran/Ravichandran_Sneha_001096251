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
public class City {
    String city;
    private ArrayList<Community> CommunityList;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public ArrayList<Community> getCommunityList() {
        return CommunityList;
    }

    public void setCommunityList(ArrayList<Community> CommunityList) {
        this.CommunityList = CommunityList;
    }
    
    
    
    
}
