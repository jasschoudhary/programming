package Numbers;

import java.util.Scanner;

/* HCF / gcd(greatest common divisor) of 2 numbers is the largest positive integer 
 * that divides both numbers without leaving a remainder
 * GCD(12,18), the factors are:    Factors of 12: 1,2,3,4,6,12
    Factors of 18: 1,2,3,6,9,18
The common factors are 1,2,3,61,2,3,6, and the largest is 6.
So, GCD(12,18)= 6.
Using the Euclidean Algorithm :Divide the larger number by the smaller number.
Example: GCD(12,18)
18÷12 = 1 remainder 6
12÷6 = 2 remainder 0 , So, GCD(12,18)=6.
 */
public class HCF_of2Numbers {
	
	static int hcf(int a , int b) {
		
//		if (a<b) {
//			return hcf(b,a) ;
//		}
		if (b==0) {
			return a ;
		}
		return hcf(b,a%b) ;  /// this is recursive call so method keeps calling 
		// until b==0 than terminates.
		//if hcf is (48,18)
		// a % b = 48 % 18 = 12
		// so hcf(18,12)
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hcf(a,b) value : ");
		int a= sc.nextInt() ;
		int b = sc.nextInt() ;
		int c  = hcf(a,b) ;
		System.out.println("hcf/gcd of numbers is : "+c);
	}
	
}
