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
public class ShapeDecorator implements Shape{
    
    protected Shape s;

    public ShapeDecorator(Shape s) {
        this.s = s;
    }
    
    @Override
    public void draw()
    {
        s.draw();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
