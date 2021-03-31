/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    String name;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private ArrayList<Restaurant> restaurantList;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem( new RestaurantDirectory(), new CustomerDirectory(), new DeliveryManDirectory());
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
     public ArrayList<Restaurant> getRestaurantList() {
         restaurantList= restaurantDirectory.getRestaurantList();
        return restaurantList;
    }
     public Restaurant addRestaurantList(String name) {
         this.name=name;
         System.out.println("boho");
         return restaurantDirectory.createAndAddRestaurant(name);
    }
    
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
