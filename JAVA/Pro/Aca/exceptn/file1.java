// File Create
import java.io.*;
class file1
{
	public static void main(String ar[]) throws IOException
	{
		FileOutputStream f;
		try
		{
			f=new FileOutputStream("a.txt", true);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not created ..");
			return;
		}
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(" Enter the contents :");
		int i;
		do
		{
			i=br.read();
			if((char)i!='$')
				f.write((char) i);
		}
		while((char)i!='$');
		System.out.println(" \t 1 file created ..");
	}
}