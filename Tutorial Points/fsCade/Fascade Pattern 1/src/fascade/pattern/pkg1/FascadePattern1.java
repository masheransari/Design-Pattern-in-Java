/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fascade.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class FascadePattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeManager manager = new ShapeManager();
        
        manager.circleDraw();
        manager.rectangleDraw();
        manager.squareDraw();
        
    }
    
}
