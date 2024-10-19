package Array;

public class commonElementsInTwoArrays {
	
	public static void main(String[] args) {
		int ar1 [] = {12, 13, 23, 15, 11, 16};
		int ar2 [] = {53, 26, 23, 15, 18, 13};
		System.out.println ("common elements are: ");
		
		for (int i=0; i<ar1.length; i++) {
			
		for (int j=0; j<ar2.length;j++ ) {
			if (ar1 [i] ==ar2 [j]) {
			System.out.println (ar1 [i]) ;
			break ;
			}
		}
		
		}
		
		
		
	}

}
