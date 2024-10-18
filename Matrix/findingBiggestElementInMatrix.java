package Matrix;

import java.util.Scanner;

public class findingBiggestElementInMatrix {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the order of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Input matrix elements
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
        

        // Row-wise maximum
        System.out.println("Maximum in Each Row:");
        for (int i = 0; i < rows; i++) {
            int maxRow = matrix[i][0];  // 1st element is already in it // Start with the first element  
            //we initialize maxRow with the first element of the current row (matrix[i][0]). 
             //This serves as our initial assumption for the maximum value in this row.
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > maxRow) { // compare 2nd,3rd,4th ele with maxrow , update if it is bigger
                    maxRow = matrix[i][j];
                }
            }
            System.out.println("Max of row " + (i + 1) + ": " + maxRow);
        }
        
        

        // Column-wise maximum
        System.out.println("\nMaximum in Each Column:");
        for (int j = 0; j < cols; j++) {
            int maxCol = matrix[0][j];  // Start with the first element in column
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] > maxCol) {
                    maxCol = matrix[i][j];
                }
            }
            System.out.println("Max of column " + (j + 1) + ": " + maxCol);
        }
        
        
        
        

	}
}
