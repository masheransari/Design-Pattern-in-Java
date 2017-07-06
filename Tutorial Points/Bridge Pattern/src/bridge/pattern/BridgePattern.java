/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.pattern;

/**
 *
 * @author asher.ansari
 */
public class BridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DrawApi[] temp = {new GreenCircle(), new RedCircle()};
        for (int i = 0; i < 2; i++) {
            Circle c = new Circle(20 * (1 + i), 50 * (1 + i), 50 * (1 + i), temp[i]);
            c.draw();
        }

    }

}
