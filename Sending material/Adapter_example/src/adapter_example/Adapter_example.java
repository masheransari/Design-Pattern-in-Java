
import adapter_example.EmpData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asher.ansari
 */
public class Adapter_example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Adapter Pattern Example in Java");
        EmpData data = new EmpData();
        data.setEmpData();
        System.out.println("The Data is:");
        System.out.println(""+data.getEmpData());
    }
    
}
