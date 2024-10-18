package Searching;

import java.util.Arrays;
import java.util.Scanner;

/* binary search = (takes a sorted array And a target value as parameter )
 *  It uses two pointers (left and right) to keep track of the search range. 
 *  it calculates the middle index and compares the middle element with the target. 
 *  If they match, it returns the index.
 *  If middle element is less than the target,it narrows the search to the right half;
 *  otherwise, it narrows it to the left half.
 *  This process repeats until the target is found or the search range is exhausted.
 *  time complexity (if the array is sorted) = O(log n)
 *  time complexity (if the array is sorted) = O(n log n)
 *  log n = f you start with n elements, after one comparison, you're left with about n/2 elements. After two comparisons, 
 *  you'll have about n/4 elements, then n/8, and so on.
 *  n/2^k =1 =>k = 2 log n => log n
 */
public class binarySearch {
	
	
	public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;    
        while (left <= right) {
            int mid = left + (right - left) / 2; // Find the middle index
            // left+right/2 - not used to avoid potential overflow 
            if (array[mid] == target) {
                return mid; // Target found, return index
            }
            
            if (array[mid] < target) {
                left = mid + 1; //target is bigger than mid so search in right half 
                // so now with new left(mid+1) and right(array.lenght-1) find mid again and keep repeating
            } else {
                right = mid - 1; //target is smaller than mid so search in left half
                //so now with new right(mid-1) and left(0) find mid again and keep repeating
            }
        }
        return -1; // Target not found
    }

	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Number of elements in the array

        int[] numbers = new int[n]; // Create an array of size n

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); // Read integers into the array
        }

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt(); // Read the target value

        // Call the binarySearch method
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close(); 
    }

}
