package Patterns.Diamond;

import java.util.Scanner;

public class numberDiamond {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows for the diamond: ");
	        int n = sc.nextInt(); // Number of rows for upper half

	        // Upper half
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print(k);
	            }
	            System.out.println();
	        }

	        // Lower half (mirror of the upper half)
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print(k);
	            }
	            System.out.println();
	        }
	    }

}
