/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author asher.ansari
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        getPlanFactory factory = new getPlanFactory();
        System.out.println("Please Enter the name of Plan for Which the bill will Generate..");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        System.err.println("1. Domestic Plan\n2. Commercial Plan\n3. Institutional Plan\n");
        System.out.println("Please Enter The Number of Bill Type");
        String planName = br.readLine();
        plan p = factory.getPlan(planName);

        System.out.println("THe Bill Type :" + p.getName() + " of Unit: " + units + " Will be: ");
        p.getRate();
        p.getCalculate(units);

    }

}
