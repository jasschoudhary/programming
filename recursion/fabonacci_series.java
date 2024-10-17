package recursion;

import java.util.Scanner;

public class fabonacci_series {
	// 0 ,1,1,2,3,5,8,13,21.....................
	// each number is the sum of two previous number is fibonacci series
	
	
	public static int fab_series(int n){
		
		// define base condition here like 
		// first term is 0
		// 2nd is 1 
		
		if (n==0) {
			return 0 ; 
		}
		if (n==1) {
			return 1 ;
		}
		return fab_series(n-1)+ fab_series(n-2) ;
	}
	
	public static void main(String[] args) {
		
		
		Scanner  sc  = new Scanner(System.in) ;
		int number = sc.nextInt()  ;
		sc.close();
		System.out.println("fab series up to "+number+" is : ");
//		System.out.println("fab series up to  number "+number+" is : ");
		for(int i =0  ; i < number ; i++) {
//			fab_series(number) ; 
			
			System.out.print(fab_series(i)+" ");
			
			
		}
		
		
	}

}
