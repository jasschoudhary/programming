package Array;

import java.util.Scanner;

public class reverse_Array {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println ("enter the size");
		int length= sc.nextInt ();
		int arr [ ] =new int [length];
		
		System.out.println ("enter the "+length+" elements");
		for (int i = 0; i < arr.length; i++){
		arr[i] =sc.nextInt ();
		}
		
		System.out.println ("Before Reverse of an Array");
		for (int i = 0; i < arr.length; i++){
		System.out.println ("arr ["+i+"] ---->"+arr[i]);
		}
		
		// reversing the elements in arr[]
		for (int i = 0; i < arr.length/2; i++){
		int t=arr[i];  // copying 1st ele to var t
		arr[i] =arr [arr.length-1-i]; // last element putting at first
		arr [arr.length-1-i] =t; // putting 1st ele from var t to last position
		}
		
		System.out.println ("After Reverse of an Array");
		for (int i = 0; i < arr.length; i++) {
		System.out.println ("arr ["+i+"] ---->"+arr[i]);
		}
	}

}
