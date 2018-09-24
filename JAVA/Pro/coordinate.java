class coor
{
	public static void main(String ar[])
	{
	int a = Integer.parseInt(ar[0]);
	int b = Integer.parseInt(ar[1]);
		Point p1 = new Point();
		p1.x=a;
		p1.y=b;
	a = Integer.parseInt(ar[2]);
	b = Integer.parseInt(ar[3]);
		Point p2 = new Point();
		p2.x=a;
		p2.y=b;
	p1.show();
	p2.show();    
	p1.add(p1,p2);
	Point p3 = new Point();
	p3 = p2.substract(p1,p2); 
	p3.show();        
	p1.dist(p1,p2);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	}
}

class Point
{	
		int x,y;
	void show()
	{
		System.out.println("("+x+","+y+")");
	}

	void add(Point a,Point b)
	{
		int c = a.x + b.x;
		int d = a.y + b.y;
		System.out.println("("+c+","+d+")");
	}	
	
	Point substract(Point p1,Point p2)
	{
		p1.x=p1.x - p2.x;
		p1.y=p1.y - p2.y;
		return p1;
	}

	void dist(Point a,Point b)
	{
		int c = a.x + b.x;
		int d = a.y + b.y;
		c=c*c;
		d=d*d;

		System.out.println(""+Math.sqrt(c+d));
	}
}