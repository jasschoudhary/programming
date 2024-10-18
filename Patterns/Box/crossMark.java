package Patterns.Box;

import java.util.Scanner;

public class crossMark {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the cross (n): ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {  // Rows
	            for (int j = 1; j <= n; j++) {  // Columns
	                // Print stars on the diagonals if n=5 for example ,
	            	// top-left to right diagonal (i,j) (1,1) (2,2) ....
	            	// top-right to left diagonal (i+j=n+1) (1+5 =5=1)
	            	//on i=1 and j=5 it prints star 
	            	// ( on j=2,3,4 it prints space )
	                if (i == j || i + j == n + 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();  // Move to the next line
	        }
	    }

}
