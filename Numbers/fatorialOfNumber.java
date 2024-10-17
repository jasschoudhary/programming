package Numbers;

import java.util.Scanner;

public class fatorialOfNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter num to get factorial :");
		int number = sc.nextInt() ;
		int fact =1 ;
		
		for(int i=1 ; i<=number ; i++) {
			fact = fact  *i ;
			
		}
		
		System.out.println(fact);
		sc.close();
	}

}
