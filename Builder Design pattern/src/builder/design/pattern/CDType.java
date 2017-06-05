/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class CDType {

    private List<Packing> list = new ArrayList<>();

    public void addItem(Packing pack) {
        list.add(pack);
    }

    public void getCost() {
        for (Packing p : list) {
            p.price();
        }
    }

    public void showItems() {
        for (Packing packing : list) {
            System.out.print("CD name : " + packing.pack());
            System.out.println(", Price : " + packing.price());
        }
    }
}