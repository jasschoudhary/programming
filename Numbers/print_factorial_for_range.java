package Numbers;

import java.util.Scanner;

public class print_factorial_for_range {
	
	public static int fact(int i ) {
		int fact = 1 ;
		while (i > 0) {
			fact = fact * i ;
			i-- ;
		}
		return fact ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int number= sc.nextInt() ;
		for(int i =1 ; i<=number ;i++) {
			System.out.println("factorial of "+i+" is "+fact(i));
		}
		sc.close();
	}
}
