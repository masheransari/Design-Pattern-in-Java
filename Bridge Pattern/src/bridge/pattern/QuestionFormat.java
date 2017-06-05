/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.pattern;

/**
 *
 * @author asher.ansari
 */
public class QuestionFormat extends QuestionManager{
    
    public QuestionFormat(String catalog) {
        super(catalog);
    }
    
    public void displayAllQues(){
          System.out.println("\n---------------------------------------------------------");  
        super.displayAllQues();
        System.out.println("-----------------------------------------------------------");  
    }
    
}
