/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_example_2;

/**
 *
 * @author asher.ansari
 */
public class factoryMethod {

    public Shape getShape(int choice) {
        switch (choice) {
            case 1:
                return new Circle();
            case 2:
                return new Rectangle();
            case 3:
                return new Square();

            default:
//                System.out.println("Invalid selection..!!");
                return null;
        }
    }

}
