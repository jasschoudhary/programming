package String;

import java.util.Arrays;
import java.util.Scanner;

// what is anagram
/*   listen  &  silent   are anagram
 * apple  &  pale   are Not anagram 
 * 
 * --> if 2 strings contains ( same characters + in the same frequency ) 
 * 
 * 1. check length of Strings , if not eql ,great , Not anagram ,return false from here only, if true than
 * 2. sort Strings by converting char array & sort + check if Strings are equal  , if eql ,is anagram
 * 3.
 * 
 * 
 */


public class checkAnagram {
	
	
	public static boolean areAnagram(String str1 , String str2) {
		if (str1.length() != str2.length()) {
			return false ;
		}
		
		char arr1[]= str1.toCharArray() ;
		char arr2[]  = str2.toCharArray() ;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2) ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("typer str1 here : ");
		String String1 =sc.next().toLowerCase() ;
		System.out.println("type str2 here : ");
		String String2 =sc.next().toLowerCase() ;
		sc.close(); 

		if (areAnagram(String1, String2)) {
			System.out.println("Strings are ANAGRAM");
		}
		else {
			System.out.println("Strings are NOT ANAGRAM");
		}
		
	}
	

}
























