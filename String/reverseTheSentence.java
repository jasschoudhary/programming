package String;

import java.util.Scanner;

public class reverseTheSentence {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence :");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rst=" ";				// reversed sentence will be stored 
		
		for(int i=ch.length-1 ; i>=0 ; i--){  // iterates from the end of the sentence [] to till start
			int k=i;
				while ( i>=0 && ch[i]!=' ') // moves backwards from end to until it finds space
				{
					i--;
				}
			int j=i+1;  // ("i+1" is at the start of word) going to start of word
				while ( j<=k)   // till end of the word 
				{
					rst =rst +ch[j];    // adding word to rest variable
					j++;
				}
			rst=rst+' '; // adding space betn words 
		}
		System.out.println("The reverse sentence is:"+rst);
	}
	

}
