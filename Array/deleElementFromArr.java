package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//// o(n) taking // copying ele in a new array 
public class deleElementFromArr {
	
	
	public static int[] deleteElement(int[] array, int index) {
        // Check if index is valid
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        // Create a new array with one less element
        int[] newArray = new int[array.length - 1];
        // Copy elements except the one at the specified index
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray; // Return the new array
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int indexToDelete = 2; // Element to delete (value 3)

        try {
            int[] newArray = deleteElement(array, indexToDelete);
            System.out.println("Array after deletion: " + Arrays.toString(newArray));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
