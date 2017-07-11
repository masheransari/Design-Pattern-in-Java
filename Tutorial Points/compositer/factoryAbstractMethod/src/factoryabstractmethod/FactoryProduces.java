/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryabstractmethod;

/**
 *
 * @author asher.ansari
 */
public class FactoryProduces {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("color")) {
            return new AbstractColor();
        } else if (choice.equalsIgnoreCase("shape")) {
            return new AbstractShape();
        } else {
            return null;
        }
    }
}
