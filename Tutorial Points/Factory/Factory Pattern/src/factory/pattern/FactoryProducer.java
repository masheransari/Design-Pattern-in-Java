/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pattern;

/**
 *
 * @author asher.ansari
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
