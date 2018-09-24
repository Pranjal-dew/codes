class Prime1
{  
 	public static void main(String args[])
	{  
		int n = Integer.parseInt(args[0]);
  		int i,m=0,flag=0;    
  		
  		m=n/2;    
  		for(i=2;i<=m;i++)
			{    
   			if(n%i==0)
				{    
   				System.out.println("Given Number :"+n+" is \"NOT\" Prime Number");
   				flag=1;    
   				break;    
   				}    
  			}    
  		if(flag==0)     
  		System.out.println("Given Number :"+n+" is Prime Number");    
	}  
}  


class Prime2
{  
 	public static void main(String ar[])
	{  
		int i = 3, count, c;
 
 		int z = Integer.parseInt(ar[0]);
 
   		if ( z>=1 )
   			{
			System.out.println("First "+z+" prime numbers are :\n");
   			}
 
   		for (count=2 ; count<=z ;  )
   			{
      			for (c=2 ; c<=i-1 ; c++ )
      				{
         			if ( i%c == 0 )
            			break;
      				}
      			if ( c == i )
      				{
         			System.out.println(""+i);
         			count++;
      				}
      			i++;
   			}
	} 
}