/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_pattern_example;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class BuilderAdapter {

    List<Item> items = new ArrayList<>();

    public BuilderAdapter() {
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public int getTotalRs() {
        int total = 0;
        for (Item i : items) {
            total += i.amount();
        }
        return total;
    }

    public void displayAll() {
        for (Item i : items) {
//            total += i.amount();
            System.out.println("Name: " + i.getName() + ", Amount: " + i.amount() + ", Packing: " + i.getPack().packing());
        }

    }
}
