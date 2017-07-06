/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fscade.pattern;

/**
 *
 * @author asher.ansari
 */
public class FscadePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeMaker maker = new ShapeMaker();
        
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
    
}
