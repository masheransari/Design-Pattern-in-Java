/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class Meal {

    private List<Item> item = new ArrayList<>();

    public void addItem(Item i) {
        item.add(i);
    }

    public void showAlLList() {
        for (Item item1 : item) {
            System.out.println("Item name: " + item1.getName());
            System.out.println("Item Packing: " + item1.getPacking().getPacking());
            System.out.println("Item Cost: " + item1.getCost());

        }
    }

    public float getAllCost() {
        float cost = 0;

        for (Item item1 : item) {
            cost += item1.getCost();
        }
        return cost;
    }

}
