// File Read
import java.io.*;
class file2
{
	public static void main(String ar[]) throws IOException
	{
		FileInputStream f;
		try
		{
			f=new FileInputStream("first.java");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found ..");
			return;
		}
		System.out.println(" The contents :");
		int i;
		do
		{
			i=f.read();
			if(i!=-1)
				System.out.print((char) i);
		}
		while(i!=-1);	// EOF
		System.out.println(" \t 1 file read ..");
	}
}