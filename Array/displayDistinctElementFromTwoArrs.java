package Array;

public class displayDistinctElementFromTwoArrs {
	
	public static void main(String[] args) {
		int ar1 [] = {12, 13, 23, 15, 11, 16};
		int ar2 [] = {53, 26, 23, 15, 18, 13};
		System.out.println ("Distinct elements from given two arrays");
		
		
		for (int i = 0; i < ar1.length; i++) {
			int find =0 ;
			for (int j=0; j<ar2.length; j++) {
				if (ar1 [i] ==ar2 [j]) {
				find=1;
				break;  // this exits the inner loop only (continues with the outer loop)
				}
			}
			if (find==0) {
				System.out.println(ar1[i]);
			}
		}
		
		for (int i = 0; i < ar2.length; i++) {
			int find =0 ;
			for (int j=0; j<ar1.length; j++) {
				if (ar2 [i] ==ar1 [j]) {
				find=1;
				break;
				}
			}
			if (find==0) {
				System.out.println(ar2[i]);
			}
			
		}
		
		
		
		
	}
}
