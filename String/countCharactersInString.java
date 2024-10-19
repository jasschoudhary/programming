package String;

import java.util.Scanner;

public class countCharactersInString {
	
	public static void main(String[] args) {
		int count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string:..........");
		String st=scn.nextLine();
		char ch[]=st.toCharArray();  
		//Converts the input string into a character array
		
		for (int i = 0; i < ch.length; i++)
		{
		if  (  ch[i]>=65&&ch[i]<=90 ||  /// 65-90 checking if A-Z
				ch[i]>=97 && ch[i]<=122||  // 97 to 122 checking if  a-z
				ch[i]>=48&&ch[i]<=57 &&  // 48 to 57 checking if 0-9
		ch[i]!=32 && ch[i]!=',' &&ch[i]!='.') 	// excluding space "," "." 	
//			if (Character.isLetterOrDigit(ch[i]))
			// if (Character.isLetter(ch[i]))
			{
			count++;
		}
		
		}
		System.out.println("No of Characters and digtis="+count);
	}

		
		
		
}
