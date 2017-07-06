/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.pattern;

/**
 *
 * @author asher.ansari
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape s) {
        super(s);
    }

    @Override
    public void draw() {
        s.draw(); //To change body of generated methods, choose Tools | Templates.
        setRedBorder(s);
    }

    public void setRedBorder(Shape shape) {
        System.out.println("Border color : Red");
    }

}
