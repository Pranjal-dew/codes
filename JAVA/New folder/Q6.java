import java.io.*;
import java.util.Scanner;

class Q6
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = scan.nextInt();
		
		if(a>999||a<100)
			{
			System.out.print("Please check the entered number.");
			}
		
		else
		{int n1 = a/100;
		int n2 = a/10-n1*10;
		int n3 = a%(n1+n2);
		
		int sum = n1+n2+n3;	

		System.out.print(n1+" + "+n2+" + "+n3+" = "+sum);
		}			
	}
}