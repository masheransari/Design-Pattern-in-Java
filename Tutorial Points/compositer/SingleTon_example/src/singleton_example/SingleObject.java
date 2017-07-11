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
public class SingleObject {

    private static SingleObject object = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return object;
    }

    public void msg() {
        System.out.println("This is the simple Example of SingleTon patterns...In Java..!!");

    }

}
