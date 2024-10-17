package Numbers;

//import java.util.Iterator;
import java.util.Scanner;

public class sumOfPrimeNumbers {
	
	public static boolean isPrime(int i) {
		if (i==1) {
			return false ;
		}
		for(int j=2 ;j<=i/2 ; j++) {   /// j*j<=i use instead of j<=i/2 
			if (i % j ==0) {
				return false ;
			}
		}
		return true ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter number to find sum of prime number ") ;
		int number =sc.nextInt() ;
		int sum = 0;
		
		for(int i = 2 ; i<=number ; i++) {
			if (isPrime(i)) {
				sum = sum + i ;
			}
			
		}
		System.out.println(sum);
		
	}

}
