package Numbers;

import java.util.Scanner;

public class multiplication_table {
	
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in) ;
	System.out.println("multiplication table  of number :");
	int number = sc.nextInt() ;
	for(int j =1 ; j<=number ;j++) {
		for(int i=1 ; i<=10 ;i++) {
		System.out.print(j*i+" ");
		}
	System.out.println();
	}
	}
	
}
