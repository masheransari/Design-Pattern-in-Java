/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

/**
 *
 * @author asher.ansari
 */
public class ShapeFactory {

    public shape ShapeFactory(int shape) {
        if (shape == 1) {
            return new Rectangle();
        } else if (shape == 2) {
            return new Circle();
        } else if (shape == 3) {
            return new Square();
        } else {
            return null;
        }
    }
}
