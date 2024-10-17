package Numbers;

//import java.util.Iterator;
import java.util.Scanner;

public class checkNumberPrimeOrNot {
	
	
	public static void main(String[] args) {
		System.out.println("enter a number to check : ");
		Scanner sc= new Scanner(System.in) ;
		int number = sc.nextInt();
		boolean isPrime = true ;
		
	if (number <=1 ) {
		 isPrime =false ;
	} else {
		
		for(int i=2 ; i<=number/2 ; i++ ) {
			if (number % i ==0) {
				isPrime =false ;
				break ;
			}
		}
		
			
		}
	
	if (isPrime) {
		System.out.println("number is prime ");
	}else {
		System.out.println("number is Not number !!");
	}
	sc.close() ;
	}

	}