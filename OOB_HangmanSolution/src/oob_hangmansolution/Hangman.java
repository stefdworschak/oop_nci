/*
 *HangmanApp.java
 *@author J. Power
 *27th Jan 2014
 */
package oob_hangmansolution;

 public class Hangman{
	 private String secret, result;
	 private char guess;
	 private StringBuffer strBuff;

	 public Hangman(){
		 secret = "julie";
		 guess = ' ';
		 strBuff = new StringBuffer("*****");
		 result = strBuff.toString();
	 }

	 public void setGuess(char guess){
		 this.guess = guess;
	 }

	 public void compute(){
		 for(int i = 0; i < secret.length();i++){
			 //System.out.println("i "+i+ " secret.charAt(i) "+secret.charAt(i)+ " guess " +guess);
			 if(secret.charAt(i)==guess){
				 strBuff.setCharAt(i,secret.charAt(i));
			 }
		 }
		 result = strBuff.toString();
	 }

	 public String getResult(){
		 return result;
	 }

	 public String getSecret(){
		 return secret;
	 }
 }
