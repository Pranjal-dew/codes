import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Q2
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Side :");

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area = "+area+" m sq");
		
	}
}