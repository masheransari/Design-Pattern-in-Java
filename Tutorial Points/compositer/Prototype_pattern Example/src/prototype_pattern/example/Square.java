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
public class Square extends Shape{

    public Square(){
    this.type = "Square";}
    @Override
    void draw() {
                System.out.println("We are on Square Method in "+this.getType());
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
