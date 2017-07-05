/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pattern.pkg1;

import java.util.Hashtable;

/**
 *
 * @author asher.ansari
 */
public class ShapeManager {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public void loadShapes() {

        Circle c = new Circle();
        c.setId("1");
        Rectangel r = new Rectangel();
        r.setId("2");
        Square s = new Square();
        s.setId("3");
        shapeMap.put(c.getId(), c);
        shapeMap.put(r.getId(), r);
        shapeMap.put(s.getId(), s);
    }

    public Shape getShape(String id) {
        Shape s = shapeMap.get(id);
        return (Shape) s.getClone();
    }

}
