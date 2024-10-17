package Array;

import java.util.Iterator;
import java.util.Scanner;

//// 
public class deleElementFromArr {
	
	static int [] deleEle(int arr1[] , int index) {
		int newArr[] = new int[arr1.length-1] ;
		
		for (int i = 0; i < arr1.length; i++) {
			if (i<arr1[index]) {
				newArr[i] = arr1[i] ;
			} else {
				

			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("enter arr size : ");
		int size = sc.nextInt() ;
		int arr1[] = new int[size] ;
		System.out.println("enter arr elements : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]= sc.nextInt() ;
		}
		int index = sc.nextInt() ;
		System.out.println("enter index of element that u wanna delete : ");
		
	}

}
