/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class CircleDraw implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public CircleDraw(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleDraw{" + "color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + '}';
    }

    @Override
    public void draw() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("" + toString());
    }

}
