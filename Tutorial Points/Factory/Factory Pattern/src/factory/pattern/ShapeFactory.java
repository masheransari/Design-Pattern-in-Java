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
public class ShapeFactory extends AbstractFactory {

    @Override
    shape getShape(int shape) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (shape) {
            case 1:
                return new Rectangle();
            case 2:
                return new Circle();
            case 3:
                return new Square();
            default:
                System.err.println("Invalid Selection");
                return null;
        }
    }

    @Override
    Color getColor(int color) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

}
