package Sorting;
/*
 * time = o(n^2)
 * Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, 
 * and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
 *  here we compare 1st and 2nd element if it is biger than swap and keep doing until it EOA .
 * 
 */

public class bubbleSort {
	
	
	
	public static void bubbleSort(int[] array) {
        int n = array.length;   // length is 7
        boolean swapped; // Flag to check if any elements were swapped

        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset the flag for each pass

            for (int j = 0; j < n - i - 1; j++) { // (n-i-1) not taking the last element cause when we start 
            	//start comparing&swapping last element will be biggest
                // Compare adjacent elements
                if (array[j] > array[j + 1]) { // for j=0,1,2,3,...,5 (to sort 1 element )
                    // Swap if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Set the flag to true
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
	
	public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
