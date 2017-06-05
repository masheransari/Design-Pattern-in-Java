/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.design.pattern;

/**
 *
 * @author asher.ansari
 */
public class BuilderDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CDBuileder buileder =new CDBuileder();
        CDType sony = buileder.builderSonyCd();
        sony.showItems();
        
        CDType samsung = buileder.builderSamsungCd();
        samsung.showItems();
    }
    
}
