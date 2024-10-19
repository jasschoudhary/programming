package String;

import java.util.Scanner;

// parseInt
public class stringTypeIntegers_To_IntegerTypeIntegers {
	
	public static int check (String s) {
		int i=0, number=0;
	for (int j = 0; j < s.length (); j++)  {

		char ch [] =s.toCharArray ();		
		if ( (ch[j]>'a' && ch[j] <='z') ||(ch[j]>'A'&&ch[j]<='Z') ) {
		return 0;
		}
	}
	
	while (i<s.length ()) {
		number= number*10;
		number=number+ (s.charAt (i++)-'0');
	}
		return number;
	}
	
	
	
	public static void main (String [] args)
	{
	Scanner sc=new Scanner (System.in);
	System.out.println ("enter the String");
	String s=sc.next ();
	System.out.println (" After converting string to integer");
	int d = check(s);
	
	if (d==0) {
		System.out.println ("not valid string ");
	}else {
		System.out.println (d + " is in integer type");
	}
	}
}
