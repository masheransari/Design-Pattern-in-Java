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
public abstract class Burger implements Item {

    @Override
    public abstract float amount();

    @Override
    public Pack getPack() {
        return new Wrap();
    }

}
