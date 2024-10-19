package String;

import java.util.Scanner;

public class palindromeOrNot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the String : ");
		String st = sc.next() ;
		String nstr="";  // empty string where reversed version of the string will be Stored .
		
		// Converts the input string into an array of characters, 
		// making it easier to swap elements.
		char ch[]= st.toCharArray();
		
		for (int i=0 ;i<ch.length/2;i++ )  // comparing till half of array
		{
		char t=ch[i];   //   storing first element from ch[] to t variable  
		ch[i]=ch[ch.length-1-i];  // assigning the element from the end to the front.
		ch[ch.length-1-i]=t;  //  puts the original front element from t variable  to at the end.
		}
		
		nstr=new String (ch);  // creating string from ch[] array .
		if(nstr.equalsIgnoreCase(st))
		System.out.println( st+" string is palindrome ");
		else
		System.out.println(st+" string is not palindrome");
		
	}

}
