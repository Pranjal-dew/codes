import java.io.*;
import java.util.Scanner;

class Q5
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = scan.nextInt();
		
		if(a==0)
			System.out.print(a+" = Neutral number.");	
		else if(a>0)
			System.out.print(a+" = Positive number.");
		else
			System.out.print(a+" = Negetive number.");
	
	}
}