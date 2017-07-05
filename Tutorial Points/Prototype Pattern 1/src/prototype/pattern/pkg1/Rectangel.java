/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class Rectangel extends Shape {

    public Rectangel() {
        type = "Rectangle";
    }

    @Override
    void draw() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("We are on Rectangle Class");
    }

}
