/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shapeDeco) {
        super(shapeDeco);
    }

    @Override
    public void draw() {
        shapeDeco.draw(); //To change body of generated methods, choose Tools | Templates.
        setBorder();
    }

    public void setBorder() {
        System.out.println("Added Red Border..!!");
    }

}
