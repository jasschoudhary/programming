package Numbers;

import java.util.Scanner;

public class rangeOf_StrongNumber {
	
	public static int fact(int n ) {
		int fact =1 ;
		while(n>0) {
			fact =fact * n ;
			n-- ;
		}
		return fact ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a number to print to get Strong number from 1 to number : ");
		int userInput = sc.nextInt() ;
		sc.close();
		for(int i=1 ; i<=userInput ; i++) {	
			int number = i ;
			int sum =0 ;
			int t = number ;	
			while(number>0) {
				int r = number % 10 ;
				sum = sum+fact(r) ;
				number = number/10 ;
			}
			if (sum == t) {
				System.out.println(t+" is a Strong number.");
			}
		}		
	}
}
