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
public class Square extends Shape {

    public Square() {
        type = "square";
    }

    
    @Override
    void draw() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("In Square Shape");
    }

}
