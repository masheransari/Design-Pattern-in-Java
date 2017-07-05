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
public class MeadBuilder {

    public Meal prepareVegMeal() {
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        return m;
    }

    public Meal prepareChickenMeal() {
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Pepsi());
        return m;
    }
}
