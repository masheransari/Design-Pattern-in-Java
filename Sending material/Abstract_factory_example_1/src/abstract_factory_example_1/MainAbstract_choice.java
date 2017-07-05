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
public abstract class MainAbstract_choice {
    
    abstract mobile_factory getMobile(int choice);
    abstract Laptop_factory getlaptop(int choice);
}
