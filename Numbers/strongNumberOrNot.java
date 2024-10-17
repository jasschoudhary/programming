package Numbers;

import java.util.Scanner;

/*
 * a number that is equal to sum of (factorial of it's digits)
 * 145 = 1! + 4! + 5! = 1+ 24 + 120 = 145 so this is a Strong number 
 * 
 */
public class strongNumberOrNot {
	
	static int fact(int n ) {
		int fact =1 ;
		while ( n>0 ) {
			fact = fact * n ;
			n-- ;
		}
		return fact ;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter num to check if strong or not : ");
		 int number = sc.nextInt() ;
		 int t = number ; 
		 int sum = 0 ;
		 while(number != 0 ) {
			 int r = number % 10 ;  // to get the last last digit each time 145 %10 =  5 
			 sum = sum +fact(r) ; 
			 number = number /10 ;    //  to remove  the last digit of number each time 145/10 = 14
		 }
		 if (sum == t ) {
			System.out.println("number is Strong !!");
		} else {
			System.out.println("number is not Strong !!");
		}
	sc.close();
	}
}
