package Array;

import java.util.Scanner;

public class zigZagMergedArr {
	
	
	public static int[] getZigZagMergedArry(int arr1[] , int arr2[]) {
		int zigZagArr[] = new int[arr1.length + arr2.length] ;

		int i =0 , j=0  ;
		// i= tracks index of arr1 and arr2
		// j = tracks index of zigZagArr elements 
		
		while (i < arr1.length  &&   i<arr2.length) {    // loop runs as long as thare are elements in arr1 and arr2
			zigZagArr[j++] =arr1[i] ;     /// add first element from arr1 to mergedArray and increment zigZagArr (j 's )value
			zigZagArr[j++] = arr2[i++] ; ///  add first element from arr2 to mergedArray and increment zigZagArr (j 's )value and i's value 
		}
		
		
		
		
		while(i < arr2.length) {      /// if arr2 has more elements than arr1
			zigZagArr[j++] = arr2[i++] ;
		}
		while(i < arr1.length) {         /// if arr1 has more elements than arr2
			zigZagArr[j++] = arr1[i++] ;  /// 
		}
		return zigZagArr ;
		
		
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		System.out.println("enter size of arr1");
		int size = sc.nextInt() ;
		int arr1[] = new int[size] ;
		System.out.println("Enter element for arr1 : ");
		for(int i=0 ; i<size ; i++) {
			arr1[i]= sc.nextInt() ;
		}
		System.out.println("enter size of arr 2 : ");
		int size2 = sc.nextInt() ;
		int arr2[] = new int[size2] ;
		System.out.println("Enter element for arr2 : ");
		for(int i=0 ; i<size2 ; i++) {
			arr2[i]= sc.nextInt() ;
		}
		
		int printOP_arr[] = getZigZagMergedArry(arr1, arr2) ;
		
		
		System.out.println("here is  ur f merged arry : ");
		
		for(int i=0 ; i<printOP_arr.length ; i++) {
			System.out.print(printOP_arr[i]+" ");
		}
		
	
	}

}
