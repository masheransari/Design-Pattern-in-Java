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
public class AbstractColor extends AbstractFactory {

    @Override
    Color getColor(int color) {
        switch (color) {
            case 0:
                return new Red();
            case 1:
                return new Blue();
            case 2:
                return new Green();
            default:
                return null;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Shape getShape(int shape) {
        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
