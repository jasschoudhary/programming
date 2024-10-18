package Patterns.Box;

import java.util.Scanner;

public class crossMarkInBox {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the box (n): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {  // Rows
            for (int j = 1; j <= n; j++) {  // Columns
                // Print * on the boundaries or diagonals
            	
//            	i == 1 or i == n: Top and bottom boundary of the box.
//            	j == 1 or j == n: Left and right boundary of the box.
//            	i == j: Left-to-right diagonal.
//            	i + j == n + 1: Right-to-left diagonal.
                if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to the next line
        }
    }

}
