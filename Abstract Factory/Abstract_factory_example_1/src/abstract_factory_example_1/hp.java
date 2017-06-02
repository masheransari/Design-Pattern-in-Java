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
public class hp extends Laptop_factory {

    @Override
    String getName() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "HP";
    }

    @Override
    void setRam(int ramTotal) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.ram = ramTotal;
    }

}
