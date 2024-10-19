package String;

import java.util.Scanner;

// A pangram is a string that contains every letter of the alphabet at least once. 
// For example, "The quick brown fox jumps over the lazy dog" is a pangram because
// it uses all the letters from 'a' to 'z'.

public class panagramOrNot {
	

    // Method to check if a string is a pangram
    public static boolean isPangram(String str) {
        boolean[] alphabet = new boolean[26]; // Array to track each letter
        // Each time a letter is found in the string, 
        // the corresponding index in the array is marked as true.
        
        int index = 0;

        // Traverse the string and mark the presence of each letter
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // taking 1by1 character from string 

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Convert to lowercase and get the alphabet index (0 to 25)
                index = Character.toLowerCase(ch) - 'a';  /// 
                // acii value for a=97,b=98,c=99 ...so on 
                // if encouterd "c" than , 99-97 = 2 
                // so a=0 ,b=1 and c =2 ....char is found 
                alphabet[index] = true; // Mark the letter as present
            }
        }

        // Check if all letters are marked as present
        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is missing, it's not a pangram
            }
        }
        return true; // All letters are present, so it's a pangram
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine(); // Read the input string

        // Call the isPangram method
        if (isPangram(input)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }

        scanner.close(); // Close the scanner
    }

}
