/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fly.weight.pattern.pkg1;

import java.util.HashMap;

/**
 *
 * @author asher.ansari
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> map = new HashMap<>();

    public static Shape getShape(String color) {

        Shape s = map.get(color);
        if (s == null) {
            s = new CircleDraw(color);
            map.put(color, s);
        }
        return s;
    }
}
