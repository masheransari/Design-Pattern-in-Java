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
public class AbstractShape extends AbstractFactory {

    @Override
    Color getColor(int color) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    Shape getShape(int shape) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (shape) {
            case 0:
                return new Rectangle();
            case 1:
                return new Circle();
            case 2:
                return new Square();
            default:
                return null;
        }
    }

}
