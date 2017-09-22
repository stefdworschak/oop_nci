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

import java.util.Scanner;

public class OOB_Lecture1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String secret;
        String newSecret;
        char guess;
        String solution;
        boolean solved;
        solved = false;
        
        Hangman hangman = new Hangman();
        Scanner keyboard = new Scanner(System.in);
           
        System.out.println("Enter a secret word: ");
        newSecret = keyboard.nextLine();
        hangman.setSecret(newSecret);
        secret = hangman.getSecret();
        
        System.out.println("Hangman secret word: ");
        for(int i = 0; i < secret.length(); i++) {
            System.out.print('*');
        }
        
        for (int j = 0; j < 11; j++) {
            System.out.println("\nCare to guess?");
            guess = keyboard.next().charAt(0);
            hangman.setGuess(guess);
            hangman.checkSecret();
            solution=hangman.getCheck();
            solved=hangman.getSolve();
            if(solved == true) {
               System.out.println("You sovled it! The secret word is "+solution+".");
               break;
            } else {
                System.out.println(solution);
            }
        }
        if(solved == false) {
            System.out.println("Sorry you had 10 tries to guess right, but you did not get the secret word.");
        }
    }
    
}
