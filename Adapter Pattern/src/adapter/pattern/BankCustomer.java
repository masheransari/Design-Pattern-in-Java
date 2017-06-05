/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern;

import java.util.Scanner;

/**
 *
 * @author asher.ansari
 */
public class BankCustomer extends careditCardVariable implements CreditCard {
    
    @Override
    public void giveBankDetail() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Account Number: ");
        double accNumber = sc.nextDouble();
        System.out.println("Enter Bank Name: ");
        String bankName = sc.nextLine();

        setAccName(name);
        setAccNumber(accNumber);
        setAccBankName(bankName);
        
        
        
    }

    @Override
    public String getCreditCard() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    double accno=getAccNumber();  
   String accholdername= getAccName();  
   String bname= getAccBankName();  
          
   return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");  
    
    
    }

}
