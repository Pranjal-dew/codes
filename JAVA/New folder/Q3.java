import java.io.*;
import java.util.Scanner;

class Q3
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Char : ");
		char w = scan.next().charAt(0);
		
		if(w=='A'||w=='a'||w=='E'||w=='e'||w=='I'||w=='i'||w=='O'||w=='o'||w=='U'||w=='u')
			{
				System.out.println("Yes");
			}
		else
			System.out.print("No");

	}
}