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
public abstract class AbstractFactory {

public abstract Loan getLone(String loan);
public abstract Bank getBank(String bank);
}
