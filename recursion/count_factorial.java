package recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class count_factorial {
	
	
	
	
	
	public static BigInteger factorial_function(int n){
		
		// base condition for factorial
		if (n ==0) {
			return BigInteger.ONE ; 	
		}
	
		// recursive case  or normal condition 
//		 return n  * factorial_function(n-1) ;	
		return BigInteger.valueOf(n).multiply(factorial_function(n-1)) ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		int number = sc.nextInt() ;
	sc.close(); 
		BigInteger result ;
		result = factorial_function(number) ;
		
		System.out.println("facorial of " + number+" is : "+result);
	
	
	
	}

}
