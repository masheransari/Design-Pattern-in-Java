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
public class Home extends Loan{

    @Override
    void getInterestRate(double rate) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.rate = rate;
    }
    
}
