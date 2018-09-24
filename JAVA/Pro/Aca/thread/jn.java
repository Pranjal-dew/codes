// Joining of a thread
class jn extends Thread
{
	jn()
	{
		start();
	}
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try
			{
				System.out.println("\t" + i);
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
			}
		}
		System.out.println(" End of the CHILD Thread ..");
	}
	public static void main(String ar[])
	{
		System.out.println(" MAIN Thread started ..");
		jn j1=new jn();
		try
		{
			j1.join();
		}
		catch(InterruptedException e)
		{
		}
		System.out.println(" End of the MAIN Thread ..");
	}
}