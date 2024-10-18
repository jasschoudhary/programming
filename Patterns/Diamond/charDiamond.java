package Patterns.Diamond;

import java.util.Scanner;

public class charDiamond {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for half the diamond: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print characters in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print((char) ('A' + k - 1));
            }
            // Print characters in decreasing order
            for (int k = i - 1; k >= 1; k--) {
                System.out.print((char) ('A' + k - 1));
            }
            System.out.println();
        }

        // Lower half (mirror of upper half)
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print characters in increasing order
            //char is used to cast int into characters
            // A = 65 , B=66 etc
            // if k=1 than //(char) ('A' + k - 1)  ==(char) 65+1-1 == char 65 = A  and so on
            for (int k = 1; k <= i; k++) {
                System.out.print((char) ('A' + k - 1));
            }
            // Print characters in decreasing order
            for (int k = i - 1; k >= 1; k--) {
                System.out.print((char) ('A' + k - 1));
            }
            System.out.println();
        }
    }

}
