/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementing;

/**
 *
 * @author asher.ansari
 */
public class Implementing {

    public static void main(String[] args) {
        MeadBuilder builder = new MeadBuilder();
        Meal m = builder.prepareVegMeal();
        System.out.println("Vegetable Meal");
        m.showItemList();
        System.out.println("Cost: "+m.getCost());
        
        System.err.println("THis is the Second Deal..!!");
        Meal n = builder.prepareChickenMeal();
        System.out.println("Chicken Meal");
        n.showItemList();
        System.out.println("Cost: "+n.getCost());
    }
}
