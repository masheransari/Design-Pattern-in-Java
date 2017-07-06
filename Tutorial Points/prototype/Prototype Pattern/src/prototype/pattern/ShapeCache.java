/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pattern;

import java.util.Hashtable;

/**
 *
 * @author asher.ansari
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public Shape getShape(String id) {
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }

    public void loadCache() {
        Circle c = new Circle();
        c.setId("1");
        shapeMap.put(c.getId(), c);
        Rectangle r = new Rectangle();
        r.setId("2");
        shapeMap.put(r.getId(), r);
        Square s = new Square();
        s.setId("3");
        shapeMap.put(s.getId(), s);
    }
}
