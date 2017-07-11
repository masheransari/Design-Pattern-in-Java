/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder_pattern_example;

/**
 *
 * @author asher.ansari
 */
public class Builder_pattern_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuilderAdapter oneAdapter = new BuilderAdapter();
        BuilderAdapter twoAdapter = new BuilderAdapter();
        oneAdapter.addItem(new Chicken());
        oneAdapter.addItem(new Pepsi());
        oneAdapter.addItem(new Vegeburger());
        oneAdapter.addItem(new Chicken());
        //total rs..
        System.err.println("Total Rupees: "+oneAdapter.getTotalRs());
        oneAdapter.displayAll();
        
        
        twoAdapter.addItem(new Chicken());
        twoAdapter.addItem(new Dew());
        System.err.println("Total Rupees: "+twoAdapter.getTotalRs());
        twoAdapter.displayAll();
    }
    
}
