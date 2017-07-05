/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern_1;

/**
 *
 * @author asher.ansari
 */
public class BuilderPattern_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MealBuilder builder = new MealBuilder();
        
        Meal m = builder.MealVege();
        System.out.println("Vegetable Meal");
        m.showAlLList();
        System.out.println("Cost: "+m.getAllCost());
        Meal n = builder.MealChicken();
        System.out.println("Chiken Meal");
        n.showAlLList();
        System.out.println("Cost: "+n.getAllCost());

    }
    
}
