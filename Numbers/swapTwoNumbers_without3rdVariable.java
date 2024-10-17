package Numbers;

import java.util.Scanner;

public class swapTwoNumbers_without3rdVariable {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("enter val 1 and 2 ");
		int num1 = sc.nextInt() ;
		int num2 = sc.nextInt() ;
		sc.close();        // n1= 2 ,n2=3 
		num1 = num1+num2 ; // n1=5 , n2 =3 
		num2 =num1-num2 ;  // n1=5 n2 = 2 
		num1  = num1-num2 ; // n1 =3 , n2 =2 ;
		
		System.out.println("val_1 ="+num1);
		System.out.println("val_2 ="+num2);
	}

}
