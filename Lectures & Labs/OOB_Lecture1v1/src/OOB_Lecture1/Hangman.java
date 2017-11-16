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
    
    //Declare my secret constant
    private final String secret = "hangman";;
    
    //Declare my variables
    private String guesses; //This is to hold multiple guesses
    private String checkedGuess;
    private char guess;
    private char temp;
    private boolean solved;

    //Constructor
    public Hangman() { 
        //Assign default values to my variables
        checkedGuess="";
        guesses = "";
        solved = false;
        
    }
    
    //Setter method to set the current guess
    public void setGuess(char guess){
        this.guess = guess;
    }
    
    //Check if the secret has been guessed and create the partially solved secret
    public void checkSecret(){
        
        //Variable for the paritially solved secret
        //Needs to be reassigned an empty value every time this method is called
        //in order not to append every time and create a longer and longer word
        checkedGuess = "";
        //Append the current char guess to the guesses String
        //e.g 
        //first itteration:  guess = 'a' --> guesses =  "a"
        //second itteration: guess = 'b' --> guesses = "ab"
        //etc
        guesses+=guess;
        
        //Nested loops to 1) loop through each letter in the secret word
        for(int i = 0; i < secret.length(); i++) {
            //and 2) check against every letter in the guesses String
            for(int j = 0; j < guesses.length();j++){
                //If the letter in guesses is the same as in secret
                // (.toLowerCase used to ignore distinction between upper and lower case)
                if(Character.toLowerCase(guesses.charAt(j)) == secret.charAt(i)) {
                    //Set the temp variable to the curren letter in secret
                    temp = secret.charAt(i);
                    //Skip to the next letter in guesses
                    j=guesses.length(); 
                } else { 
                    //Otherwise set temp to *
                    temp = '*';
                }
            }
            //Append tempt to checkedGuess
            checkedGuess += temp;
        }
        //After both loops finish, check if the secret has been guessed
        if(checkedGuess.equals(secret)) {
            //Set solved to true
            solved = true;
        }
    }
        
    /**
     * Get the value of secret
     *
     * @return the value of secret
     */
    //Three get methods to return secret, checkedGuess and solved
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
