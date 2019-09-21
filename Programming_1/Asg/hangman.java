package Asg;

import java.util.Scanner;

public class Hangman {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] words = {"intelligence", "mosquito", "binomial", "population", "alphabetical", "oddities" };
    
//  when its false the game will end
    while(true) {
    	
//    randomize word for quiz
      String word = words[(int) (Math.random() * words.length)];
      String hidden = new String(new char[word.length()]).replace("\0", "*");
      int tries = 0;
      
//    number of attempts
      while (tries < 5 && hidden.contains("*")) {
        System.out.println("Enter a letter in the word " + hidden);
        String guess = scanner.nextLine();
        
        String unhide = "";
        for (int i = 0; i < word.length(); i++) {
          if (word.charAt(i) == guess.charAt(0)) {
            unhide += guess.charAt(0);
          } else if (hidden.charAt(i) != '*') {
            unhide += word.charAt(i);
          } else {
            unhide += "*";
          }
        }
//      to prompt the the letter is in correct and only reveals if the letter is correct
        if (hidden.equals(unhide)) {
          tries++;
          System.out.println(guess + " is not in the word.");
        } else {
          hidden = unhide;
        }
        if (hidden.equals(word)) {
          System.out.println("The word is " + word + " you missed " + tries + " time");
        }
        
      }
      
      System.out.println("Do you want to guess another word? (y/n)");
      String again = scanner.nextLine();
      
      if(!again.equalsIgnoreCase("y")) {
        System.out.println("\nThank you for playing!");
        break;
      }
    }
    
    scanner.close();

  }

}
