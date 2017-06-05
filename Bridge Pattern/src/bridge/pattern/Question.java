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
public interface Question {

    public void nextQuestion();

    public void previousQuestion();

    public void deleteQuestion(String q);

    public void newQuestion(String q);

    public void displayQuestion();

    public void displayAllQuestion();

}
