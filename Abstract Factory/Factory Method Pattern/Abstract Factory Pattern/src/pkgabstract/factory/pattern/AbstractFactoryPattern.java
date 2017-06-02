/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author asher.ansari
 */
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        System.err.println("1. HBL\n2. Habib\n3. UBL");
        String bankNumber = br.readLine();

        System.out.println("Enter the type of loan");
        System.err.println("1. Home loan.\n2. Educational Loan.\n3. Business loan.");
        String loanName = br.readLine();

//        AbstractFactory bankFactory = FactoryCreator().get
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankNumber);

        System.out.print("\n");
        System.out.print("Enter the interest rate for " + b.getName() + ": ");

        double rate = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount = Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from " + b.getName());
    
        AbstractFactory abstractFactory = FactoryCreator.getFactory("Loan");
        Loan loan = abstractFactory.getLone(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
    }

}
