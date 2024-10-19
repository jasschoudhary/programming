package String;

import java.util.Scanner;

public class convertNumberIntoWords {
	
			static String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten",
			"eleven","tweleve","thirteen","fourteen","fifteeen","sixteeen","seventeen","eighteen","nineteen"};
			
			static String two[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eigty","ninety"};
	
			static void pw(int n, String st) {
				if (n<=19) {
					System.out.print(one[n]+" ") ;
				} else {
					System.out.print(two[n/10]+one[n%10]+" ");
				}
				
				if (n!=0) {
					System.out.println(st+" ");
				}
			}
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		pw(num/10000000,"crores");
		pw((num/100000)%100,"Lakhs");
		pw((num/1000)%100,"Thousand");
		pw((num/100)%10,"Hundered");
		pw(num%100," ");
	}
	

}
