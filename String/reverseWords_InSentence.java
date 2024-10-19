package String;

import java.util.Scanner;

public class reverseWords_InSentence {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rst=" ";
		for (int i=0 ;i<ch.length;i++ ) {
			
			int k=i;
			while (i<ch.length &&ch [i]!=' '){  // from start to till the end of word or until encounters a space
				i++;
			}
			
			int j=i-1;  //// j is now at the end  of 1st word in sentence
			while ( k<=j) {    // k has start index of so until start of the word
				rst=rst + ch[j];  // storing in "rest" var from back to start in reverse manner 
				j--;
			}
			rst=rst+' ';  // adding space btn words
		}
		System.out.println("The reserved words of sentence is:"+rst);
		
		
		
	}

}
