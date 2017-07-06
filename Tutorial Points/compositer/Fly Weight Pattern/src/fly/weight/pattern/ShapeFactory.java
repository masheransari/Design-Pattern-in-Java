/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.pattern;

import java.util.HashMap;

/**
 *
 * @author asher.ansari
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> map = new HashMap<>();

    public static Shape getCircle(String color) {
        CircleShape circle = (CircleShape) map.get(color);

        if (circle == null) {
            circle = new CircleShape(color);
            map.put(color, circle);
            System.out.println("Creating circle of Color : " + color);
        }
        return circle;
    }
}
