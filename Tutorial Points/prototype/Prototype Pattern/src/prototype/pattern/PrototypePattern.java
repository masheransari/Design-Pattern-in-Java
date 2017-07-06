/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pattern;

/**
 *
 * @author asher.ansari
 */
public class PrototypePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeCache cache = new ShapeCache();
        cache.loadCache();

        for (int i = 1; i < 4; i++) {
            Shape s = (Shape) cache.getShape(String.valueOf(i));
            System.out.println("Shape : "+s.getType());
//            s.draw();
        }
    }

}
