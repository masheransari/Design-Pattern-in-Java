/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

/**
 *
 * @author asher.ansari
 */
public class getPlanFactory {

    public plan getPlan(String planType) {

//        if (planType == null) {
//            return null;
//        } else if (planType.equalsIgnoreCase("DOMESTIC")) {
//            return new domestic();
//        } else if (planType.equalsIgnoreCase("COMMERCIAL")) {
//            return new commercial();
//        } else if (planType.equalsIgnoreCase("INSTUTIONAL")) {
//            return new institutional();
//        }
//        return null;
          if (planType == null) {
            return null;
        } else if (planType.equalsIgnoreCase("1")) {
            return new domestic();
        } else if (planType.equalsIgnoreCase("2")) {
            return new commercial();
        } else if (planType.equalsIgnoreCase("3")) {
            return new institutional();
        }
        return null;
    }

}
