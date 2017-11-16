/*
 * OOB_Lecture1.java
 * @author: S. Dworschak
 * 22 Sept 2017
 */
package OOB_Lecture1;
/**
 *
 * @author Stefan
 */

import java.util.Scanner;

public class OOB_Lecture1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare my variables
        String secret;
        String solution;
        char guess;
        boolean solved;
        
        //Assign a default value to solved
        //This variable is used to check if the secret was guessed
        //and break the loop or print out a message at the end
        //if the secret was not guessed.
        solved = false;
        
        //Instantiate my Hangman class
        Hangman hangman = new Hangman();
        //Instantiate my Scanner class to read input
        Scanner keyboard = new Scanner(System.in);
        
        //Get the secret defined in my Hangman Class as default
        secret = hangman.getSecret();
        
        
        System.out.print("Hangman secret word: ");
        //Print out as many stars as there are letters in the secret
        for(int i = 0; i < secret.length(); i++) {
            System.out.print('*');
        }
        
        
        //Loop 10 times (= 10 tries to guess)
        for (int j = 0; j < 11; j++) {

            //Ask for user input
            System.out.println("\nCare to guess?");
            
            //Read 1st letter of user input
            guess = keyboard.next().charAt(0);
            
            //Set the guess variable guess in the Hangman class
            hangman.setGuess(guess);
            
            //check if a letter has been guessed 
            //and if the secret has been solved
            hangman.checkSecret();
            
            //Return the partially or fully resolved secret
            //e.g. if the secret word is "secret" and the guess is 'e'
            //this will return *e**e*
            solution=hangman.getCheck();
            //Return if the secret has been solved
            solved=hangman.getSolve();
            
            //Check if the secret has been solved
            if(solved == true) {
               //If it has print out the solution and break the loop
               System.out.println("You sovled it! The secret word is "+solution+".");
               break;
            } else {
                //Otherwise print out the partially/not solved secret
                //As per example this will print *e**e*
                System.out.println(solution);
            }
        }
        //End of Loop
        //If the secret has not been solved
        if(solved == false) {
            //Print out the below message
            System.out.println("Sorry you had 10 tries to guess right, but you did not get the secret word.");
        }
    //End of application
    }
   
}
