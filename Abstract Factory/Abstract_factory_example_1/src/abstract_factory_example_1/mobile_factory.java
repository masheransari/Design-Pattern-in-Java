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
public abstract class mobile_factory {

    public static double mobileAmount = 0;

    abstract String getMobileName();

    abstract double getMobileAmount();
}
