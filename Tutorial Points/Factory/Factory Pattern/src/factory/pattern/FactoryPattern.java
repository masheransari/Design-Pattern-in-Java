/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pattern;

import java.util.Scanner;

/**
 *
 * @author asher.ansari
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String choice = null;
        System.err.println("Please Enter Your Choice..\nShape\nColor");
        choice = s.nextLine();
        
        
        if (choice.equalsIgnoreCase("color")) {
            Color color = FactoryProducer.getFactory(choice).getColor(1);
            color.fillColor();
        } else if (choice.equalsIgnoreCase("shape")) {
            shape shape = FactoryProducer.getFactory("SHAPE").getShape(1);
            shape.draw();
        } else {
            System.err.println("Invalid Selection..!!");
        }

    }

}
