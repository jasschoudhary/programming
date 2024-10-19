package String;

import java.util.Scanner;

public class countLowercaseUppercaseSymbolSpace {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		char ch[]=st.toCharArray(); // converting string to char[]
		int  uc=0,lc=0,spc=0,dc=0,sp=0;  // upper lower space decimal specialCharacter
		
		for (int i=0;i<ch.length ;i++ ) {
			
		if (ch[i]>=65&&ch[i]<=90){
			uc++;
		}
		else if (ch[i]>=97&&ch[i]<=122) {
			lc++;
		}
		else if (ch[i]>=48&&ch[i]<=57) {
			dc++;
		}
		else {
				if(ch[i]==' ') {
					sp++;
				}else {
					spc++ ;
				}
			}
	}
		
		System.out.println("no :of upper case letter "+uc);
		System.out.println("no: of lower case letter" +lc);
		System.out.println("no: of decimal number" +dc);
		System.out.println("no: of spaces "+sp);
		System.out.println("no: of special characters" +spc);
		
		
		
	}
}
