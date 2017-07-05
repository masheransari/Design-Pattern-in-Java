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
public class VegBurger extends Burger{

    @Override
    public float getCost() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 200;
    }


    @Override
    public String getName() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Vegetable Burger";
    }
    
}
