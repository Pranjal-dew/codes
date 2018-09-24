import java.io.*;
import java.util.Scanner;

class Q1
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your marks :");
		double m1 = scan.nextDouble();
		double m2 = scan.nextDouble();
		double m3 = scan.nextDouble();
		double m4 = scan.nextDouble();
		double m5 = scan.nextDouble();
		
		double avg = (m1+m2+m3+m4+m5)/5;
		double per = ((m1+m2+m3+m4+m5)/500)*100;
		if(m1<=100&&m2<=100&&m3<=100&&m4<=100&&m5<=100)
		{System.out.println("Persentage = "+per+" %");
		System.out.println("Average = "+avg);}
		else
		System.out.println("Error in data.");



	}
}