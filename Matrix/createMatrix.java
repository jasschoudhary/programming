package Matrix;

import java.util.Scanner;
public class createMatrix {

	// A matrix with m rows and n columns is like a table with m * n cells.
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the order of the matrix (rows and columns)
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = scanner.nextInt();

	        // Initialize the matrix with the given dimensions
	        // we are declaring a two-dimensional array (or matrix) of integers.
	        //The first set of brackets [] indicates that this is an array that can hold other arrays.
	        // The second set of brackets [] indicates that each element in this
	        //  first array (which is itself an array) will also be an array of integers.
	        int[][] matrix = new int[rows][cols];

	        // Input matrix elements from the user
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Display the matrix
	        System.out.println("\nThe Matrix is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();  // Move to the next row
	        }

	        scanner.close();
	    }
	



}