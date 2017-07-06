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
public class SingleTonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleTonClass obj = SingleTonClass.getInstance();
        obj.showMessage();
    }

}
