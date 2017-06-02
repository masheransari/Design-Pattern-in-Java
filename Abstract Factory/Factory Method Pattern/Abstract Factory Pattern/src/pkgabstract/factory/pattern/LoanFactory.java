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
public class LoanFactory extends AbstractFactory{

    @Override
    public Loan getLone(String loan) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(loan == null)
        {
            return null;
        }
        else if(loan.equalsIgnoreCase("1")){
            return new Home();
        }
        else if(loan.equalsIgnoreCase("2")){
            return new Education();
        }
        else if(loan.equalsIgnoreCase("3")){
            return new Business();
        }
        return null;
    }

    @Override
    public Bank getBank(String bank) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
}
