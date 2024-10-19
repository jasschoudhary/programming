package String;

import java.util.Scanner;

public class occurenceOfEachCharacterInString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		int n=st.length();
		char ch[]=st.toCharArray();
		
		for (int i=0;i<n ;i++ ) {  // taking the 1st character 
			int count=1; // initializing the count for the 1st character
			for (int j=i+1;j<n ; j++ ) {  // takes next char or second character (i+1)
				if (ch[i]==ch[j])  // and compares with the first char i
				{
						count++;   // if i== j than increment the count 
						int k=j;   // a new variable k is in pic
						
						while(k<n-1) {
							ch[k]=ch[k+1]; // removing duplicacy by replacing char(k) with  char(k+1)
							k++; 
						}
						n-- ;  // 1 element less so decreasing arr length
						j-- ; // now that new element is at j so adjusting j to check the new element at position j
				}	
			}
			System.out.println(ch[i]+" occurred "+count+" times");
		}
		String nst=" ";
		for (int i=0;i<n ;i++ ){
			nst=nst + ch[i]; ///  building a new string by using char[] (at last char[] has only the unique characters)
		}
		System.out.println("here all the char :(no duplicacy)"+nst);
	}
}
