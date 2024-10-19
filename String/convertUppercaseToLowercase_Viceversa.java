package String;

import java.util.Scanner;

public class convertUppercaseToLowercase_Viceversa {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		// A-Z  == 65,66,67,68 .....90
		// a-z == 97,98,99 ....122
		for (int i=0 ;i<ch.length;i++ )
		{
			if (ch[i]>=65 && ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
			}
			else if ( ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		st=new String(ch);
		System.out.println("converted String in Case : "+st);
		
	}
	

}
