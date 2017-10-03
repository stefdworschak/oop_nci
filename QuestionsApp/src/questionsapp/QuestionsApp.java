/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsapp;

/**
 *
 * @author x15037835
 */
import javax.swing.JOptionPane;
public class QuestionsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String question, correctAnswer, optionA, optionB, optionC;
        int mark, maxWordCount;
        int numLoops;
        int qChoice;
        
        numLoops = Integer.parseInt(JOptionPane.showInputDialog("How many questions are in your quiz?"));
        
        for(int i = 0; i < numLoops; i++) {
        
            qChoice = Integer.parseInt(JOptionPane.showInputDialog("What type of question do you want to create? \n(1) Basic Question \n(2) Multiple Choice \n(3) Essay Question"));
            
            
        
        }
        
        
        //How many questions does this quiz have
        
        //Loop x times
        
        //What type is your x question
            //Give a choice either 1,2,3 
            
            //If statement
            
                //If Choice = 1
                    
                    //Ask for input of the Basic attributes
                     
                    
                     MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is the capital of Italy?", "Rome", 5, "Paris","Rome","Berlin");
                     System.out.println(question1.printDetails());
                //If Choice =  2
                
                    //Ask for additional attributes
                    
                    EssayQuestion question2 = new EssayQuestion("Compare and contrast Waterfall vs Agile","",20,2000);
                    question1.setCorrectAnswer("Paris");
                    
                    System.out.println(question2.printDetails());
        
        
    }
    
}
