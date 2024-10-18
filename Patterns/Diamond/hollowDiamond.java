package Patterns.Diamond;

import java.util.Scanner;


// in lower half logic same logic is used in reverse order
public class hollowDiamond {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows for half the diamond: ");
	        int n = sc.nextInt();

	        // Upper half
	        for (int i = 1; i <= n; i++) {
	            // Print spaces outside only
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars + inside spaces 
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                if (k == 1 || k == 2 * i - 1) {  // first and last always printing stars
	                    System.out.print("*"); // Only at boundaries
	                } else {
	                    System.out.print(" "); // Inside spaces
	                }
	            }
	            System.out.println();
	        }

	        // Lower half (mirror of the upper half)
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Print boundary stars with spaces inside
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                if (k == 1 || k == 2 * i - 1) {   // first and last always printing stars
	                    System.out.print("*"); // Only at boundaries
	                } else {
	                    System.out.print(" "); // Inside spaces
	                }
	            }
	            System.out.println();
	        }
	    }

}
