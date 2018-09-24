class th extends Thread
{
	th()
	{
		start();
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
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
		new th();
		for(int i=101; i<=110; i++)
		{
			try
			{
				System.out.println("\t" + i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}