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
abstract class plan {
    protected double rate;
    abstract void getRate();
    abstract String getName();
    public void getCalculate(int units){
        System.out.println(""+(rate*units));
    }
    
}
