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
public abstract class Laptop_factory {

    public static int ram = 0;

    abstract String getName();

    abstract void setRam(int ramTotal);

    public double getLaptopRupees() {
//        double rupees = 0.0;
        int normalRupee = 15000;
        double ramCount = this.ram / 4;
        
        System.out.println(""+(normalRupee * ramCount)+" and ramCount = "+(this.ram / 4));
//        rupees = normalRupee * ramCount;
        
        return (normalRupee * ramCount);
    }
}
