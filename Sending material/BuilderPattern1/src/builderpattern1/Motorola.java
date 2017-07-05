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
public class Motorola implements ItemImplement{

    @Override
    public String getItemName() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Motorola Mobile";
    }

    @Override
    public int getItemPrice() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 15000;
    }
    
}
