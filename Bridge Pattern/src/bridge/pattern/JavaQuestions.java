/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class JavaQuestions implements Question {

    private int current = 0;
    private List<String> questions = new ArrayList<>();

    public JavaQuestions() {
        questions.add("What is class? ");
        questions.add("What is interface? ");
        questions.add("What is abstraction? ");
        questions.add("How multiple polymorphism is achieved in java? ");
        questions.add("How many types of exception  handling are there in java? ");
        questions.add("Define the keyword final for  variable, method, and class in java? ");
        questions.add("What is abstract class? ");
        questions.add("What is multi-threading? ");
    }

    @Override
    public void nextQuestion() {
        if (current <= questions.size() - 1) {
            current++;
            System.out.println("" + current);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void previousQuestion() {
        if (current > 0) {
            current--;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteQuestion(String q) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        questions.remove(q);
    }

    @Override
    public void newQuestion(String q) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        questions.add(q);
    }

    @Override
    public void displayQuestion() {
        System.out.println(""+questions.get(current));
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayAllQuestion() {
        for(String ques : questions)
        {
            System.out.println(""+ques);
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
