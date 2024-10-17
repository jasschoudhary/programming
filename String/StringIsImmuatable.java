package String;

public class StringIsImmuatable {
	
	
	
	public static void main(String[] args) {
		
		String str1 = "this" ;
		String str2 =  str1.concat("is a String") ;
		
		
		System.out.println("str1 : "  +str1);
		System.out.println("Str2 : " +str2);
		
		if (str1 == str2) {
			System.out.println("yes string str1 and str2 are same so strings are mutable");
		}
		else {
			System.out.println("No , string str1 and str2 are NOT same so Strings are Immutable ");
		}
		
	
		
	}

}
