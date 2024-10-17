package Patterns.Triangle;

import java.util.Scanner;

public class invertedTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a no for pattern : ");
	  int n= sc.nextInt() ;
	  
	  //  starts decreases with each row // r1star5 ,r2star4 ,..... so i=n and j<=i
		for (int i = n; i >=1 ; i--) {  // outer loop = for row
			for (int j = 1; j<=i ; j++) { // inner loop = for printing stars 
				System.out.print("*");
			}
			System.out.println();   /// to move to the next line 
		}
		sc.close();
	}
	

}
