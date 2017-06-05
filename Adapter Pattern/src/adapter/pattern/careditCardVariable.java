/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.pattern;

/**
 *
 * @author asher.ansari
 */
public class careditCardVariable {

    public String accName;
    public String accBankName;
    public double accNumber;

    public careditCardVariable() {
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccBankName(String accBankName) {
        this.accBankName = accBankName;
    }

    public void setAccNumber(double accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccBankName() {
        return accBankName;
    }

    public double getAccNumber() {
        return accNumber;
    }

}
