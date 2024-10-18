package Date_Year;

import java.util.Scanner;
//A leap year is a year that contains an extra day, February 29th,
//year that feb has 29 days in it .
//1) divi by 4 , and 400 , 
//2)  not divisible by 100 
//3)
public class yearIsLeapOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("typer year : ");
		int year =sc.nextInt() ;
		
		if ((year % 4 ==0 && year % 100 != 0 ) || year % 400 ==0) {
			System.out.println(year+" is leap year.");
			
		} else {

			System.out.println(year+" is not leap year ");
		}
				
	}
}
