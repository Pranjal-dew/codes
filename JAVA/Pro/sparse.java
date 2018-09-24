class sparse
{  
 	public static void main(String args[])
	{  
		
		int[][] a = {{10,10,4},{0,2,5},{1,0,2},{3,1,1},{9,8,6}};
		

		int r,c;
		System.out.println("Given Sparse Matrix is : ");
  		    
  		for(r=0;r<5;r++)
			{
			System.out.println("");    
   			for(c=0;c<3;c++)
				{    
   				System.out.print(" "+a[r][c]);
   				}    
  			}       
	}  
}  


class first
{

public static void main(String args[])
	{  
		
		int[][] a1 = {{10,10,4},{0,2,5},{1,0,2},{3,1,1},{9,8,6}};
		int a2[][]=new int [10][10];

		int r1,c1,r2,c2,val;
		System.out.println("Given Matrix is : ");
  		    
  		for(r1=1;r1<5;r1++)
			{
			System.out.println("");    
   			r2 = a1[r1][0];
			c2 = a1[r1][1];
			val = a1[r1][2];
			a2[r2][c2] = val;
			}
		for(r2=0;r2<10;r2++)
			{
			System.out.println("");    
   			for(c2=0;c2<10;c2++)
				{    
   				System.out.print(" "+a2[r2][c2]);
   				}    
  			} 
       
	}  

}

class second
{

public static void main(String args[])
	{  
		
		int[][] a1 = {
                              {0,0,5,0,0,0,0,0,0,0}
                             ,{2,0,0,0,0,0,0,0,0,0}
                             ,{0,0,0,0,0,0,0,0,0,0}
                             ,{0,1,0,0,0,0,0,0,0,0}
                             ,{0,0,0,0,0,0,0,0,0,0}
                             ,{0,0,0,0,0,0,0,0,0,0}
                             ,{0,0,0,0,0,0,0,0,0,0}
                             ,{0,0,0,0,0,0,0,0,0,0}
                             ,{0,0,0,0,0,0,0,0,0,0}
                             ,{0,0,0,0,0,0,0,0,6,0}
			     };
		
		int a2[][]=new int [10][10];
		
		int r1,c1,r2,c2,val,i,j;
		for(r1=0;r1<10;r1++)
		{
			for(c1=0;c1<10;c1++)
			{
			if(a1[r1][c1]!=0)
			{//System.out.println("");   
   			r2 = a1[r1];
			c2 = a1[c1];
			val = a1[r1][c1];
			a2[r2][c2] = val;
			}
			}
		}
       
		for(i=0;i<r2;i++)
			{
			System.out.println("");    
   			for(j=0;j<c2;j++)
				{    
   				System.out.print(" "+a2[r2][c2]);
   				}    
  			}
		
	} 

}