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
abstract class Loan {

    protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int year) {

        double EMI;
        int n;

        n = year * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;

        System.err.println("Your Montly EMI will be :" + EMI + " for the Amount " + loanAmount + " you have borrowed");
    }
}
