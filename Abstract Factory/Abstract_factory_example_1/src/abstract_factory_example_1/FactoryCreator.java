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
public class FactoryCreator {

public static MainAbstract_choice getFactory(String choice)
{
   if(choice.equalsIgnoreCase("MOBILE"))
        {
            return new choiceMobileFactory();
        }
        else if(choice.equalsIgnoreCase("LAPTOP"))
        {
            return new choiceLaptopFactory();
        }
        return null;
    }    
}
