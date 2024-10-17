package Numbers;

import java.util.Scanner;

/* a number that is divisible by 1 and itself ONLY is prime number.(1 is not prime number)
 * 2,3,5,7,11,13,17,19,23,
 * 
 */
public class printPrimeNumbers {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter number to print numbers upto : ");
		int number = sc.nextInt() ;
		
		for(int i=2 ; i <= number ; i++) {
			boolean isPrime =true ;           // starting setting flag to true 
			
			
			
			for(int j=2 ; j<=i/2 ; j++) {  // we are not checking for all the i condition but i/2 (only first half)
				if ( i%j == 0) {			// j * j <= i also can be used instead of j<=i/2 
					isPrime = false ;     /// if it is divisible so we set isPrime flag to false and break out of loop (means not a prime number )
					break ;    /// break will exit the if-else and inner loop.
				} 
			}
			
			if (isPrime) {
				System.out.print(i+ " ");
			}
			
			
		}
		
		
		
		
 	}
}









