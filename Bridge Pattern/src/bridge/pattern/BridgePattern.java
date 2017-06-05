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
public class BridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        QuestionFormat format = new QuestionFormat("Java Programming Questions..");
        format.q = new JavaQuestions();
        format.newQuest("What is Class?");
        format.displayQues();
        format.deleteQues("What is Interface?");

        format.newQuest("How many types of inheritance are there in java?");

        format.displayAllQues();
    }

}
