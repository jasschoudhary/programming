package Patterns.Box;

import java.util.Scanner;

public class hollowBox {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of the box (n): ");
	     int n = sc.nextInt();
	     for (int i = 1; i <= n; i++) {  // Rows
	            for (int j = 1; j <= n; j++) {  // Columns
	                // Print stars only on the boundary
	                if (i == 1 || i == n || j == 1 || j == n) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();  // Move to the next line
	        }
	     
	     
	 }
	

}
