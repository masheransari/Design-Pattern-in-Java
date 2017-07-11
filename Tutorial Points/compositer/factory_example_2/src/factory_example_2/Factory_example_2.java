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
public class Factory_example_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factoryMethod method = new factoryMethod();
        for (int i = 0; i < 10; i++) {
            Shape s = method.getShape(i);
            if (s == null) {
                System.out.println("Invalid Choice..!!");
            } else {
                s.draw();
            }
        }
    }

}
