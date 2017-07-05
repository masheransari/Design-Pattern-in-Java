/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_example_1;

import java.util.Scanner;

/**
 *
 * @author asher.ansari
 */
public class Abstract_factory_example_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your choice, Whether Buy 1. Mobile or 2. Laptop");

        int choice = sc.nextInt();
        String chocieString = null;
        switch (choice) {
            case 1:
                chocieString = "Mobile";
                MainAbstract_choice mf = FactoryCreator.getFactory(chocieString);
                System.err.println("please Select your Mobile Brand..\n1. LG\n2.Samsung\n3. Infnix");
                int mobileChoice = sc.nextInt();
                mobile_factory mobile = mf.getMobile(mobileChoice);
                
                System.out.println(mobile.getMobileName()+" Mobile Selected and Price will be: "+mobile.getMobileAmount());
//                mobile.setMoblieAmount(choice);
                return;
            case 2:
                chocieString = "Laptop";
                MainAbstract_choice lf = FactoryCreator.getFactory(chocieString);
                System.err.println("please Select your Laptop Brand..\n1. HP\n2.LENOVO\n3. APPLE");
                int choiceLaptop = sc.nextInt();
                System.out.println("HOw Many Ram GB Laptop you want..??");
                int ram = sc.nextInt();
                Laptop_factory laptop = lf.getlaptop(choiceLaptop);
                laptop.setRam(ram);
                System.out.println(laptop.getName()+" Selected and Price will be: "+laptop.getLaptopRupees());
                return;

            default:
                return;
        }

    }

}
