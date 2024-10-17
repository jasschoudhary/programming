package Numbers;

import java.util.Scanner;

// 1234 --> 4321


public class reverse_Number {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("enter number to reverse : ");
		 int number = sc.nextInt();
		 int reverse  = 0 ;
		while (number > 0) {
			reverse =  reverse * 10 + ( number % 10 );  
			// rev*10 -->shifting the digit to left   
			//  number%10-->getting the last digit from the number 
			 number = number / 10 ;  
			 // removing the last digit from the number 
			
		}
		System.out.println(reverse);
		sc.close();
	}

}
