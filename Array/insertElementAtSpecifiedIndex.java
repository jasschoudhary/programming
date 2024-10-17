package Array;

import java.util.Scanner;

/// step 1 : create a array  take inputs like size , arr elements , index , and element for inserting 
// step 2 : method check if insterted elem is valid or not ,(if valid) create a new array and insert element at mentioned index , 
//          and copy other valued from the array 




///  insert a element in array at a specified index 
public class insertElementAtSpecifiedIndex {

	// && ---> requires both condition to be true 
	// || ---> requires at least one condition to be true 
	public static int [] insertVal(int arr1[] , int index , int ele) {
		
		if (ele < 0 ||  index > arr1.length) {
			System.out.println("invalid element's val /index ");
			return arr1 ;
		}
		
		int newArry[] = new int[arr1.length+1] ;  // creating a new array 
		newArry[index] =ele ;   /// copying the element at specified index in the new array
		
		for (int i = 0; i < arr1.length; i++) {
			if (i < index) {   
				newArry[i] = arr1[i] ;  // copying the values from the array arr1 to newArry (before the index )
			} else {               
				newArry[i+1] =arr1[i] ;  // copying the values to newArry array from the arr1 (after the index )
			}
		}
		return newArry ;
		

		
	}
	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in) ;
		
		System.out.println("enter the size of array : ");
		int size = sc.nextInt() ;
		int arr1[]= new int[size] ; 
		
		System.out.println("enter the elements for the array :   ");
		for (int i = 0; i < arr1.length; i++) {
		       	arr1[i] = sc.nextInt() ;
		}
		
		System.out.println("enter element  : ");
		int ele = sc.nextInt() ;
		
		System.out.println("enter index position of element  : ");
		int index  = sc.nextInt() ;
		sc.close();
		
		int opArray[] = insertVal(arr1, index, ele) ;
		
		for (int i = 0; i < opArray.length; i++) {
			System.out.print(opArray[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
