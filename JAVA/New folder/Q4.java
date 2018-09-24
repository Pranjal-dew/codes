import java.io.*;
import java.util.Scanner;

class Q4
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = scan.nextInt();		
		int b = scan.nextInt();		
		int c = scan.nextInt();		
		int res;

		if(a>b)
			{
			if(a>c) res = a;
			else res = c;
			}		
		else
			{
			if(c>b) res = c;
			else res = b;
			}

		System.out.print("Largest number = "+res);

	}
}