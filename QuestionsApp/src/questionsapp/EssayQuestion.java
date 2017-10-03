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
public class EssayQuestion extends Question {
    
    private int maxWordCount;
    
    public EssayQuestion(String questionText, String correctAnswer, int mark, int maxWordCount) {
    
        super(questionText, "", mark);
        this.maxWordCount = maxWordCount;
    
    }
    
    public EssayQuestion() {
        this("","",0,0);
    }
    
    public void setMaxWordCount(int maxWordCount) {
        this.maxWordCount = maxWordCount;
    }
    
    public int getMaxWordCount() {
        return maxWordCount;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+" MaxWordCount: "+maxWordCount;
    }
    
}
