/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

/**
 *
 * @author Stefan
 */
public class QuizApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Quiz q = new Quiz("What's the capital of Italy?","Rome",100);
        System.out.println(q.getDetails());
        
        MCQuiz mcq = new MCQuiz("What year did WWII end?","1945",100,"1943","1944","1945");
        System.out.println(mcq.getDetails());
        
    }
    
}
