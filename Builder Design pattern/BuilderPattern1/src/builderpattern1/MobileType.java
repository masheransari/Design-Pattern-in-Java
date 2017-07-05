/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class MobileType {
    private List<ItemImplement> data = new ArrayList<>();
    
    public void addItem(ItemImplement ii){
        data.add(ii);
    }
        public void showItems() {
        for (ItemImplement packing : data) {
            System.out.print("Item name : " + packing.getItemName());
            System.out.println(", Price : " + packing.getItemPrice());
        }
    }
//    public void getItem(){
//        for(ItemImplement ii: data){
//            ii.getItemName();
//        }
//    }
}
