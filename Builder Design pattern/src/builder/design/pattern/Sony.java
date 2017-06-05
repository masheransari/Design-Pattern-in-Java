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
public class Sony extends Company{

    @Override
    public int price() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 20;
    }

    @Override
    public String pack() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Sony CD";
    }
    
}
