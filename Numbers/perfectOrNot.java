package Numbers;

import java.util.Scanner;

/* a number that is equal to sum of its proper divisors (excluding number itself).
 * 6 = 1+2+3  this is perfect number 
 * 28 = 1 + 2 +4+7+14
 * only positive numbers
 * all perfect numbers are even 
 *  ex - 6 ,28 ,496 ...
 *  
 */

public class perfectOrNot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)  ;
		System.out.println("enter number to check perfect or not ");
		int number =sc.nextInt() ;
		sc.close();
		int sum = 1;
		for(int i=2 ; i<=number/2 ;i++) {
			if (number%i==0) {
				sum = sum +i ;				
			}
		}
		if (sum == number) {
			System.out.println("number is perfect");
		} else {
			System.out.println("number is not perfect");
		}
	}

}
