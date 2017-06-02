/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory.pattern;

/**
 *
 * @author asher.ansari
 */
public class BankFactory extends AbstractFactory{
   public Bank getBank(String bank){  
      if(bank == null){  
         return null;  
      }  
      if(bank.equalsIgnoreCase("1")){  
         return new HBL();  
      } else if(bank.equalsIgnoreCase("2")){  
         return new Habib();  
      } else if(bank.equalsIgnoreCase("3")){  
         return new ubl();  
      }  
      return null;  
   }  
    @Override
    public Loan getLone(String loan) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
}
