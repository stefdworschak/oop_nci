/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOB_Lecture1;

/**
 *
 * @author Stefan
 */
public class Hangman {
    
    private String secret;
    private char guess;
    private String guesses;
    private String checkedGuess;
    private char temp;
    private boolean solved;

    public Hangman() {
        secret = "";
        checkedGuess="";
        guesses = "";
        solved = false;
        
    }
    
    public void setGuess(char guess){
        this.guess = guess;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }
    
    public void checkSecret(){
        
        checkedGuess = "";
        guesses+=guess;
        //System.out.println(guesses);
        for(int i = 0; i < secret.length(); i++) {
            for(int j = 0; j < guesses.length();j++){
                //System.out.println(guesses.charAt(j));
                if(Character.toLowerCase(guesses.charAt(j)) == Character.toLowerCase(secret.charAt(i))) {
                    //System.out.println("Secret: "+secret.charAt(i));
                    temp = secret.charAt(i);j=guesses.length(); 
                } else { temp = '*';}
            }
            checkedGuess += temp;
        }
        if(checkedGuess.equals(secret)) {
            solved = true;
        }
    }
        
    /**
     * Get the value of secret
     *
     * @return the value of secret
     */
    public String getSecret() {
        return secret;
    }    
    
    public String getCheck () {
        return checkedGuess;
    }
    
    public boolean getSolve(){
        return solved;
    }
    
}
