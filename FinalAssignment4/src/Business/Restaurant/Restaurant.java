/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author harold
 */
public abstract class Restaurant extends Business.Organization {
    private String name;
    private int id;
    private static int count = 1;

    public Restaurant(String name) {
        this.name=name;
        //id = count;
        //count++;
    }

    public int getId() {
        return id;
    }


    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
public ArrayList<Role> getSupportedRole(){
ArrayList<Role> roles = new ArrayList();
roles.add(new AdminRole());
return roles;
}
    
}
