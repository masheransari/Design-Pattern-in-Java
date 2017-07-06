/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.pattern;

/**
 *
 * @author asher.ansari
 */
public class Circle extends Shape {

    private int radius, x, y;

    public Circle(int radius, int x, int y,DrawApi api) {
        super(api);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        api.drawCircle(radius, x, y);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
