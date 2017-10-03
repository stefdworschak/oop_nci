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
public class MCQuiz extends Quiz {
    
    String optionA, optionB, optionC;
    
    public MCQuiz(String question, String correctAnswer, int marks, String optionA, String optionB, String optionC){
    
        super(question, correctAnswer, marks);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        
    }
    
    public MCQuiz(){
     
        this("","",0,"","","");
        
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+"; Option A: "+optionA+"; Option B: "+optionB+"; Option C: "+optionC;
    }
    
}
