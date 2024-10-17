package Array;

//import java.util.Iterator;
import java.util.Scanner;

public class creatingArr {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("pls enter size of array : ");
		int size = sc.nextInt() ;
		
		int arr1[] = new int[size] ;
		
		System.out.println("pls enter element of your array : ");
		for (int i = 0; i < arr1.length; i++) {
			 arr1[i]= sc.nextInt() ;
		}
		sc.close();
		System.out.println("Here is your array : ");
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
