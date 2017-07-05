/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class Meal {
 
    private List<Item> items = new ArrayList<>();
    public void addItem(Item i){
        items.add(i);
    }
    
    public float getCost(){
        float cost = 0;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }
    
    public void showItemList(){
        for (Item item : items) {
            System.out.println("Item: "+item.getName());
            System.out.println("Packing: "+item.getPack().getPack());
            System.out.println("Price: "+item.getPrice());
        }
    }
    
}
