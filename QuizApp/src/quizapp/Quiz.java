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
public class Quiz {
    
    private String question;
    private String correctAnswer;
    private int marks;
    
    public Quiz(String question, String correctAnswer, int marks){
        
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.marks = marks;

    }
    
    public Quiz(){
        this("","",0);
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getMarks() {
        return marks;
    }
    
    public String getDetails(){
       return "Question: "+question+"; Correct Answer: "+correctAnswer+"; marks: "+marks;        
    }
    
}
