package String;

import java.util.Scanner;

public class countCharactersInEachWord {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String nst=" ";  // this stores the word
		int nc=0;	// Counter for characters in the current word
		for (int i=0; i<s.length();i++ ){
				
			if (s.charAt(i)==' ') {
				nst=nst + nc;  //  ex . this is xyz -->this4is2xyx3 will o/p
				nc=0;  // reseting character counter for the next word
			}
			else {
				nc++;  // if a non-space character is found than
				nst=nst + s.charAt(i);
			}
		}
		nst=nst + nc;
		System.out.println (" no of character in each word in a string is "+ nst);
		
	}

}
