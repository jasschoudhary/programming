package Numbers;

import java.util.Scanner;

public class palindromeOrNot {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a number : ");
		int number  = sc.nextInt() ;
		int t  = number ; 
		int reverse = 0 ;
		while (number != 0) {
			reverse  = reverse * 10 + (number %10) ;
			number =number / 10 ;
		}
		
		if (reverse == t) {
			System.out.println("number is Palindrome");
		} else {
			System.out.println("number is not Palindrome ");

		}
		sc.close(); 
	}

}
