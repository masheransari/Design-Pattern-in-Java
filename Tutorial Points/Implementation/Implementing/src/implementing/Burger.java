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
public abstract class Burger implements Item {

    @Override
    public Packing getPack() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new WrappedPack();
    }

    @Override
    public abstract float getPrice();

}
