/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_example_1;

/**
 *
 * @author asher.ansari
 */
public class LG extends mobile_factory{

    @Override
    public String getMobileName() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "LG";
    }
   @Override
    double getMobileAmount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        this.mobileAmount = amount;
        return 35000;
    }
    
}
