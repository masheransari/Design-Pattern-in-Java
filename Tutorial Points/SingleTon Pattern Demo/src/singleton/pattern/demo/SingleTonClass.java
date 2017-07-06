/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.pattern.demo;

/**
 *
 * @author asher.ansari
 */
public class SingleTonClass {

    private SingleTonClass() {
    }
    private static SingleTonClass instance = new SingleTonClass();

    public static SingleTonClass getInstance() {
        return instance;
    }

    public void showMessage() {
        System.err.println("This is an example of SingleTonClass in Tutorial Point..!!");
    }
}
