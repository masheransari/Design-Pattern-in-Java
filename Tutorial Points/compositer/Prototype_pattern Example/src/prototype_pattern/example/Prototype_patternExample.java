/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_pattern.example;

/**
 *
 * @author asher.ansari
 */
public class Prototype_patternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prototype_Factory factory = new Prototype_Factory();
        factory.loadShapes();

        for (int i = 1; i < 4; i++) {
            Shape s = factory.getClone("" + i);
            if (s == null) {
                System.err.println("Not found..!!");
            } else {
                s.draw();
            }
        }
    }

}
