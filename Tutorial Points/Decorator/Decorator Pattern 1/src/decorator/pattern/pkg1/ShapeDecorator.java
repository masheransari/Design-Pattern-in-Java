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
public class ShapeDecorator implements Shape {

    protected Shape shapeDeco;

    public ShapeDecorator(Shape shapeDeco) {
        this.shapeDeco = shapeDeco;
    }

    public void draw() {
        shapeDeco.draw();
    }

}
