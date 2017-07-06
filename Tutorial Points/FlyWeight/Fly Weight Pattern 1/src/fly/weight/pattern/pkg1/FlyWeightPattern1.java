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
public class FlyWeightPattern1 {

    /**
     * @param args the command line arguments
     */
    private static final String[] colors = {"red", "blue", "brown", "black", "pink", "yellow", "White", "Margenta"};

    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 0; i < 20; i++) {
            CircleDraw c = (CircleDraw) ShapeFactory.getShape(getColor());
            c.setRadius(100);
            c.setX(getX());
            c.setY(getY());
            c.draw();
        }
    }

    private static String getColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getX() {
        return (int) (Math.random() * 100);
    }

    private static int getY() {
        return (int) (Math.random() * 100);
    }

}
