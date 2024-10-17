package Numbers;

public class PrimeNumber_02_code {
	
	public static void main (String [] args)
	{
	java.util.Scanner sc=new java.util.Scanner (System.in);
	System.out.println ("enter number");
	int n=sc.nextInt ();
	System.out.println ("Prime numbers between 1 and " + n);
	//loop through the numbers one by one
	for (int i=2; i < n; i++)
	{
	boolean isPrime = true;
	//check to see if the number is prime
	// we dont have to to check till i all iteration it not efficeint instead we can do just 
	// check i/2 , cause if it's not found in first half it's prime .
	for (int j=2; j < i ; j++)
	{
	if (i % j == 0)
	{
	isPrime = false;
	break;
	}
	}
	// print the number
	if (isPrime)
	System.out.print (i + " ");
	}
	}
	}


