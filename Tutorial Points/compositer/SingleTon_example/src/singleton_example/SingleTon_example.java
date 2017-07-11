/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_example;

/**
 *
 * @author asher.ansari
 */
public class SingleTon_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject object = SingleObject.getInstance();
        
        object.msg();
    }
    
}
