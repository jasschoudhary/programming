package Array;

public class findBiggestAndSecondBiggestElement {
	public static void main(String[] args) {
		
	
	int ar[] = {23, 12, 14, 56, 22, 28, 13};

    // Initialize both to the minimum possible integer value
    int fbig = Integer.MIN_VALUE;
    int sbig = Integer.MIN_VALUE ;

    for (int i = 0; i < ar.length; i++) {
        if (ar[i] > fbig) {
            sbig = fbig;  // Update second largest
            fbig = ar[i];  // Update largest
        } else if (ar[i] > sbig && ar[i] != fbig) {
            sbig = ar[i];  // Update second largest if not equal to the largest
        }
    }

    if (sbig == Integer.MIN_VALUE) {
        System.out.println("Second largest element not found");
    } else {
        System.out.println("First largest element is " + fbig);
        System.out.println("Second largest element is " + sbig);
    }
}

}
