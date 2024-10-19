package Array;
// o(n)  linear search
public class searchElementInArray {
	
	 public static int linearSearch(int[] array, int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; // Target found
	            }
	        }
	        return -1; // Target not found
	    }

	    public static void main(String[] args) {
	        int[] unsortedArray = {9, 3, 5, 1, 7, 11};
	        int target = 5;

	        int result = linearSearch(unsortedArray, target);
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }

}
