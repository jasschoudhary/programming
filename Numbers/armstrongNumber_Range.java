package Numbers;

import java.util.Scanner;

public class armstrongNumber_Range {
	

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
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("enter number get armstrong range from 1 to : ");
		int number = sc.nextInt() ;
		sc.close();
			
		for(int i=0 ; i<=number ; i++) {

			boolean r = isArmstrong(i) ; 
			  if (r) {
				System.out.println(i+" number is armstrong.");
			}
			  
		}
		
	}
}
