package String;

import java.util.Scanner;

public class initcap_OfWordsInString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for (int i=0 ;i<ch.length;i++ ) {
			
			if ( i==0  || (ch[i]!=' '&&ch[i-1]==' ')  ) 
			{
					if (ch[i]>=97&&ch[i]<=122)
					{
						ch[i]=(char)(ch[i]-32);
					}
						else if (ch[i]>=65&&ch[i]<=90)
					{
						ch[i]=(char)(ch[i]-32);
					}
				
			}
			
		}
		st=new String(ch);
		System.out.println("enter the string in it cap : "+st) ;
		
	}

}
