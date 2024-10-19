package String;

import java.util.Scanner;

public class substringFinding {
	
	public static void main(String[] args) {
		System.out.println("enter the main string (no space)");
		Scanner sc=new Scanner(System.in);
		String st1=sc.next();
		char ch1[]=st1.toLowerCase().toCharArray();  // convert String to char[]
		
		System.out.println("enter the sub string");
		String st2=sc.next();
		char ch2[]=st2.toLowerCase().toCharArray();
		sc.close();
		int find=0;
		for (int i=0;i<ch1.length ;i++ ) 
		{
				int k=i, j=0;
			// while checks if the characters from the both string match ,if (k,j) matched than gets incremented
				// k = main string , j = substring
				while (k<ch1.length && j<ch2.length && ch1[k]==ch2[j])		{
					j++;
					k++;
				}
				if(j==ch2.length) {
						find++;
						System.out.println( find+" times "+st2+" present between "+i+" to"+k+" indexs");
					}
		}
		
		if(find==0) {
		System.out.println("not found") ;
		}
		
		
		
		
		
		
	}
}





