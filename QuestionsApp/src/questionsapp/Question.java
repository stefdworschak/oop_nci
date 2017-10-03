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
public class Question {
    
    private String questionText, correctAnswer, answer;
    private int mark;
    
    //Basic Question
    public Question(String questionText, String correctAnswer, int mark){
            this.questionText = questionText;
            this.correctAnswer = correctAnswer;
            this.mark = mark;
            this.answer = "";
    }
    public Question(){
        this("", "", 0);
    } 
    
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public String getQuestionText() {
        return questionText;
    }
    
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    public int getMark() {
        return mark;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public String printDetails(){
        return "Correct Answer: "+correctAnswer+"; Mark: "+mark;
    }
    
}
