/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern1;

/**
 *
 * @author asher.ansari
 */
public class BuilderPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ItemBuilder builder = new ItemBuilder();
        MobileType mobileType = builder.builderLG();
        mobileType.showItems();
        MobileType lgtype = builder.builderMotorola();
        lgtype.showItems();
        MobileType samsungtype = builder.builderMotorola();
        samsungtype.showItems();
        
    }
    
}
