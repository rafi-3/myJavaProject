package Practice3a;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {  
		String reverse = "";
	    
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println("Enter a string: ");
	    String s1 = scanner.next();
	    
	    int length = s1.length();
	    
	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + s1.charAt(i);
	    
	    if (s1.contentEquals(reverse)) {
	      
	      System.out.println(s1 + " is palindrome.");
	    }
	    
	    else {
	      
	      System.out.println(s1 + " is not palindrome.");
	    }
	    
	    scanner.close();
	}
}
