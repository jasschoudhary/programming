package Array;

import java.util.Scanner;

public class merge_2_Arrys {
	
	
//	initializing and creating a array (arrays are fixed size )
//	int arr123[] = new int[size1212] ;
//	int arr12[] = new int[2] ;
	
	public static int[] getMergedArrys(int arr1[],int arr2[]){
		int mergedArr[]= new int[arr1.length + arr2.length] ;
		
		for(int i=0 ; i<arr1.length ; i++) {
			mergedArr[i] = arr1[i] ;
		}
		
		for(int i =0 ;i<arr2.length ; i++) {
			mergedArr[i + arr1.length] = arr2[i] ;
			/// here arr1 takes arr1.length-1 space so so first element from arr2 will be placed at [arr1.length]
			//  and 2nd at arr1.length+1 , 3rd at arr1.length+3........etc .
			
		}
		return mergedArr; 
		
		
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
		
		int printOP_arr[] = getMergedArrys(arr1, arr2) ;
		
		
		System.out.println("here is  ur f merged arry : ");
		
		for(int i=0 ; i<printOP_arr.length ; i++) {
			System.out.print(printOP_arr[i]+" ");
		}
		
	
	}

}
