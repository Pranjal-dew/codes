import java.io.*;
class in1
{
	public static void main(String ar[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print(" Enter a no. : ");
		int i=Integer.parseInt(br.readLine());
		System.out.print(" Enter another no. : ");
		int j=Integer.parseInt(br.readLine());
		int k=i+j;
		System.out.println(" The sum is : " + k);
	}
}