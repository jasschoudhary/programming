package Searching;

import java.util.Scanner;
/*linearSearch Method: This method takes an array and a target value 
 * as parameters. It iterates through each element of the array and 
 * checks if it matches the target. If a match is found, it returns 
 * the index of that element. If the loop completes without finding 
 * the target, it returns -1.
 * 
 */
public class linearSearch {
	 // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in) ;
        System.out.println("total number of elements :");
        int size = sc.nextInt() ;
    	int[] numbers  = new int[size] ;
    	System.out.println("enter "+size+" elements :");
    	for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt() ;	
		}
    	System.out.println("enter elemet want to search :");
        int target = sc.nextInt();

        // Call the linearSearch method
        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

}
