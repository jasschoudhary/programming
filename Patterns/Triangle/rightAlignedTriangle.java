package Patterns.Triangle;

import java.util.Scanner;

// mirror of right angle triangle 
public class rightAlignedTriangle {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("enter a no for pattern : ");
		int n  = sc.nextInt() ; 
		/// spaces are decreadign with each rows 
		// stars are increasing with each rows
		// 
		for (int i = 1; i <=n ; i++) {
			
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
