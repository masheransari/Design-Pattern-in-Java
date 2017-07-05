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
public abstract class Bottle implements Item {

    @Override
    public abstract float getCost();

    @Override
    public Pack getPacking() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new BottlePack();
    }

    
}
