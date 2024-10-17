package Patterns.Triangle;

import java.util.Scanner;

public class invertedPyramid {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("enter a no of row for inverted pyramid  : ");
		int n  = sc.nextInt() ; 
		
		for (int i = 0; i <n ; i++) {
			
			// on i=0 it prints no space and then(1=1-->1 does) i=2 it does 2 and so on.
			for (int j = 0; j <i ; j++) {
				System.out.print(" ");
			}
		// a pyramid with height n has 2n-1 stars in top row (inverted pyramid)
			// so with subsequent row (in inverted pyramid) it decreases by 2 
			// 2n-1 , 2(n-1)-1 , 2(n-2)-1 ,...... so on  decreasing by 2 
			for (int k = 0; k <(2*(n-i)-1) ; k++) {
			System.out.print("*");		
				}
			System.out.println();
			
		}
	}

}
