/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_pattern.example;

import java.util.HashMap;

/**
 *
 * @author asher.ansari
 */
public class Prototype_Factory {

    HashMap<String,Shape> mapFactory = new HashMap<>();
    public Shape getClone(String id){
        
        Shape shape  = mapFactory.get(id);
        return (Shape) shape.clone();
    }
    
    public void loadShapes(){
//        mapFactory.put(, new CIrcle);
        CIrcle cIrcle = new CIrcle();
        cIrcle.setId("1");
        mapFactory.put(cIrcle.getId(), cIrcle);
        
        Square s = new Square();
        s.setId("2");
        mapFactory.put(s.getId(), s);
        
        Rectangle r = new Rectangle();
        r.setId("3");
        mapFactory.put(r.getId(), r);
    }
}
