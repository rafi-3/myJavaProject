package Practice4;

import java.util.Scanner;

public class q1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter ten integers: ");
	    int[] n = new int[10];

	    for (int i = 0; i < 10; i++) 
	      
	      n[i] = scanner.nextInt();
	   
	    for (int i = n.length - 1; i >= 0; i--) 
	      
	    System.out.print(n[i] + " ");
	    
	    scanner.close();
	}
}
