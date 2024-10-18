package Patterns;

import java.util.Scanner;

public class m_pattern {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the height of the M (n): ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {  // Rows
        for (int j = 1; j <= n; j++) {  // Left side stars
            // Print stars on the borders and diagonals forming "M"
        	
//        	j == 1 || j == n: Ensures stars on the left and right borders.
//        	i == j && i <= n / 2: Ensures stars on the left diagonal of the "M".
//        	i + j == n + 1 && i <= n / 2: Ensures stars on the right diagonal of the "M".
//        	Else: Print a space.
            if (j == 1 || j == n || (i == j && i <= n / 2) || (i + j == n + 1 && i <= n / 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();  // Move to the next row
    }
}
}
