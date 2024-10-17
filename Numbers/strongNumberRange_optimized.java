package Numbers;

import java.util.Scanner;

public class strongNumberRange_optimized{
	

	    // Pre-compute factorials of digits 0 to 9
	    private static final int[] FACTORIALS = new int[10];

	    static {
	        for (int i = 0; i < 10; i++) {
	            FACTORIALS[i] = factorial(i);
	        }
	    }

	    // Method to calculate factorial of a number
	    public static int factorial(int n) {
	        int fact = 1;
	        while (n > 0) {
	            fact *= n;
	            n--;
	        }
	        return fact;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to print Strong Numbers from 1 to that number: ");
	        int userInput = sc.nextInt();
	        sc.close();

	        System.out.println("Strong numbers between 1 and " + userInput + ":");

	        // Loop through the range 1 to userInput
	        for (int i = 1; i <= userInput; i++) {
	            if (isStrong(i)) {
	                System.out.println(i + " is a Strong number.");
	            }
	        }
	    }

	    // Method to check if a number is Strong
	    public static boolean isStrong(int number) {
	        int sum = 0, temp = number;

	        // Calculate the sum of the factorials of digits
	        while (temp > 0) {
	            int digit = temp % 10;  // Extract last digit
	            sum += FACTORIALS[digit];  // Use pre-computed factorial
	            temp /= 10;  // Remove last digit
	        }

	        // Return true if the sum equals the original number
	        return sum == number;
	    }
	}



