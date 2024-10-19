package Array;

import java.util.Scanner;

public class findBiggestAndSmallestElement {
	
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Initialize largest and smallest
        int largest = array[0];
        int smallest = array[0];
        
        // Find largest and smallest elements
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        
        // Output results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        
        scanner.close();
    }

}
