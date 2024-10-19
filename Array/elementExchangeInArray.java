package Array;

public class elementExchangeInArray {
	
	public static void main (String [] args)
	{
	int ar[]={21,12,15,32,16,17,22};
	System.out.println ("BEFORE EXCHANGE OF ARRAY");
	
	for (int i = 0; i < ar.length; i++) {
		System.out.println (ar[i]);
	}
	
	int n;
	if (ar.length%2==0)
		n=ar.length/2;
	else
		n= (ar.length/2) +1;
	
	for (int i=0; i<ar.length/2; i++){
		int t=ar[i]; // storing 1st value  
		ar[i] =ar [n+i];  // storing mid+1 value at 1st value
		ar [n+i]=t; // storing 1st value at mid+1
	}
	
	
	System.out.println ("AFTER EXCHANGE OF ARRAY");
	for (int i = 0; i < ar.length; i++){
		System.out.println (ar[i]);
	}
	
	
	
	
	
	}
}
