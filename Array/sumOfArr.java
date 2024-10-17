package Array;

//import java.util.Iterator;
import java.util.Scanner;

public class sumOfArr {

	
	
	public static int arrSum(int arr1[]) {
		int sum =0 ;
		for (int i = 0; i < arr1.length; i++) {
			sum =sum+arr1[i] ;
		}
		return sum ; 
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter size of arr: ");
		int size = sc.nextInt() ;
		int arr1[] = new int[size] ;	
System.out.println("enter element of array : ");		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt() ;
		}
		sc.close(); 
		System.out.println("sum of array is : "+arrSum(arr1));
		
	}
}
