// Synchronization : One at a time
class syn extends Thread
{
	syn()
	{
		start();
	}
	public void run()
	{
		x();
	}
	synchronized static void x()
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
	}
	public static void main(String ar[])
	{
		new syn();
		new syn();
	}
}