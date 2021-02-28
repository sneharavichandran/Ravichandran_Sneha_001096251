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
public class PersonDirectory {
    private ArrayList<Person> personList = new ArrayList();

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void addPersonList(Person person) {
        this.personList.add(person);
    }
    
    
    
}
