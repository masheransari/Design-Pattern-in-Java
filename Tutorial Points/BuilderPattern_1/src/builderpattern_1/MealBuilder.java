/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern_1;

/**
 *
 * @author asher.ansari
 */
public class MealBuilder {

    public Meal MealVege() {
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        return m;
    }

    public Meal MealChicken() {
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Pepsi());
        return m;
    }

}
