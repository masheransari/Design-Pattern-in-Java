/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_pattern_example;

/**
 *
 * @author asher.ansari
 */
public abstract class ColdDrink implements Item{

    @Override
    public Pack getPack() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new Bottle();
    }

    @Override
    public abstract float amount();   
}
