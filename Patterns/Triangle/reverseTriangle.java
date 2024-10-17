package Patterns.Triangle;

import java.util.Scanner;

public class reverseTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a no . : ");
		int n= sc.nextInt() ;
		for (int i = 0; i < n; i++) {  // Outer loop for rows
		    
			for (int j = 0; j < i; j++) {  // Inner loop for spaces
		        System.out.print(" ");  // Print space
		    }
			// stars decreases by n-i  (or by 1)
		    for (int k = 0; k < (n - i); k++) {  // Inner loop for stars
		        System.out.print("*");  // Print star
		    }
		    System.out.println();  // Move to the next line
		}
	}

}
