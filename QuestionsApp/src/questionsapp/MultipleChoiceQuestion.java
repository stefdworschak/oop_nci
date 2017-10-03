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
public class MultipleChoiceQuestion extends Question {
    
    private String optionA,optionB,optionC;
    
    public MultipleChoiceQuestion(String questionText, String correctAnswer, int mark, String optionA, String optionB, String optionC) {
        
        super(questionText, correctAnswer, mark);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        
    }
    
    public MultipleChoiceQuestion() {
        this("","",0,"","","");
    }
    
    public void setOptionA (String optionA){
        this.optionA = optionA;
    }
    
    public void setOptionB (String optionB){
        this.optionB = optionB;
    }
    
    public void setOptionC (String optionC){
        this.optionC = optionC;
    }
    
    public String getOptionA(){
        return optionA;
    }
    
    public String getOptionB(){
        return optionB;
    }
    
    public String getOptionC(){
        return optionC;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+" Option A: "+optionA+" Option B: "+optionB+" Option C: "+optionC;
    }
    
}
