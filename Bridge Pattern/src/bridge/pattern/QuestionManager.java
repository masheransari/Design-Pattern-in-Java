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
public class QuestionManager {
    
    protected Question q;
    public String catalog;
    
    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }
    
    public void next() {
        q.nextQuestion();
    }
    
    public void previous() {
        q.previousQuestion();
    }

    public void newQuest(String ques) {
        q.newQuestion(ques);
    }

    public void deleteQues(String ques) {
        q.deleteQuestion(ques);
    }
    public void displayQues(){
        q.displayQuestion();
    }
    public void displayAllQues(){
        System.out.println("Question Papaer: "+catalog);
        q.displayAllQuestion();
    }
}
