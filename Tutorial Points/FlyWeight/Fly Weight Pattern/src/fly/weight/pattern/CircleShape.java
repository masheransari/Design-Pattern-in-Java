/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.pattern;

/**
 *
 * @author asher.ansari
 */
public class CircleShape implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

//    public CircleShape(String color, int x, int y, int radius) {
//        this.color = color;
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }

    public CircleShape(String color) {
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

    
    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "CircleShape{" + "color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + '}';
    }

    @Override
    public void draw() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.err.println("" + toString());
    }

}
