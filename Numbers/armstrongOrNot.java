package Numbers;

import java.util.Scanner;
/*
 * armstrong number = sum of power of it's digits (power is raised to the number of digits)is equal to the number itself . 
 * 371 = (3)^3 +(7)^3 + (1)^3 
 * 9 == (9)^1
 * 1421 == 1^4 +4^4 +2^4+1^4 
 * 1-9 is armstrong
 * 153 , 370 ,371 , 407 is armstrong  .
 * 
 */
public class armstrongOrNot {
	
	static boolean isArmstrong(int x) {
		int nd = countDigit(x) ;
		int t =x ;
		int sum = 0 ;
		while (t > 0) {
			int r  = t % 10 ;
			sum = sum + power(r, nd) ;
			t = t/10 ; 
		}
		
		if (sum == x) {
			return true ;
		} else {
			return false ;
}
	}
	
	// get power of digits
	static int power(int digit ,int p) {
		int c =1 ; 
		while (p > 0) {
			c = c * digit;
			p-- ;
		}
		return c ;
	}
	
	// count the number of digit in number or power raised to 
	static int countDigit(int n1) {
		int count =0 ;
		while (n1 >0) {
			count++ ;
			n1 = n1/10 ;
		}
		return count ;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("enter the number to check armstrong ");
		  int number = sc.nextInt() ;
		  boolean r = isArmstrong(number) ;
		  sc.close();
		  
		  if (r) {
			System.out.println("number is armstrong !");
		} else {
			System.out.println("number is not armstrong !!!");
		}

		  
		
	}

}
