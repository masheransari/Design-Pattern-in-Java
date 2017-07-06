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
public class RedCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Draw Circle [color: red] with Radius: "+radius+", X: "+x+" and Y: "+y);
    }
    
}
