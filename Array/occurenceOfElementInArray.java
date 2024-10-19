package Array;

public class occurenceOfElementInArray {
	
	static void display(int a[]) {
		for (int i=0; i<a.length; i++) {
			System.out.println (i+"------->"+a[i]);
		}
	}
	
	static int occurred (int a [], int ele) {
	int count=0;
	for (int i=0; i<a.length; i++) {
		if (ele==a[i])
		count++;
	}
	return count;
	}
	
	public static void main(String[] args) {
		int ar[]={22,11,23,11,15,19,11};
		int in=occurred (ar, 11);
		display (ar);
		if (in>=0)
		System.out.println ("your element occurred "+in);
		else
		System.out.println ("not valid");
		
	}

}
