/*
 *HangmanApp.java
 *@author J. Power
 *27th Jan 2014
 */

package oob_hangmansolution;
import javax.swing.JOptionPane;
public class OOB_HangmanSolution{
	public static void main(String args[]){
		String input, secret, result;
		char guess;

		Hangman myHangman = new Hangman();

		//input
		input = JOptionPane.showInputDialog(null, "Please enter a letter");
		guess = input.charAt(0);

		//process
		myHangman.setGuess(guess);
		myHangman.compute();
		result = myHangman.getResult();
		secret = myHangman.getSecret();

		//output
		JOptionPane.showMessageDialog(null, "The result is " + result);
		JOptionPane.showMessageDialog(null, "The secret word was " + secret);
	}
}
