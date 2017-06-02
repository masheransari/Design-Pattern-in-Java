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
public class choiceLaptopFactory extends MainAbstract_choice{

    @Override
    mobile_factory getMobile(int choice) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    Laptop_factory getlaptop(int choice) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(choice)
        {
            case 0:
                return null;
            case 1:
                return new hp();
            case 2:
                return new Lenovo();
            case 3: 
                return new Apple();
            default:
                return null;
        }
    }
    
}
