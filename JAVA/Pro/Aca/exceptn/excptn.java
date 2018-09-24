class excptn
{
	public static void main(String ar[])
	{
		String s=ar[0];
		if(s.equals("Java"))
			System.out.println(" Sahi baat : " + s);
		else
		{
			try
			{
				// NoMatchException n=new NoMatchException();
				// throw n;
				throw new NoMatchException();
			}
			catch(NoMatchException e)
			{
				System.err.println(e);
			}
		}
	}
}