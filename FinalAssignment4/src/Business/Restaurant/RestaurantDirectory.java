/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.awt.PopupMenu;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {

    public static PopupMenu get;
        private ArrayList<Restaurant> restaurantList;
   

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public RestaurantDirectory(){
        restaurantList=new ArrayList<>();
    }
    
    //Create enterprise
   public Restaurant createAndAddRestaurant(String name){
        
      
            Restaurant restaurant=new Restaurant(name);
            restaurantList.add(restaurant);
        
        return restaurant;
    }
}
