/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

import java.util.Scanner;

/**
 *
 * @author asher.ansari
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean temp = true;
        Scanner sc = new Scanner(System.in);
        ShapeFactory factory = new ShapeFactory();
        while (temp) {
            int choice = 0;
            System.out.println("Please Enter Your Choice\n1. Rectangle\n2. Circle\n3. Square");
            choice = sc.nextInt();
            shape shape = factory.ShapeFactory(choice);
            shape.draw();
            System.err.println("Do Your Want to Continue..??");
            System.out.println("Press 1 to Continuee..!!");
            choice = sc.nextInt();
            if (choice != 1) {
                temp = false;
            }

        }
    }

}
