import java.awt.*;
import java.applet.*;
//import java.awt.Graphics;

/*
<applet code = applet_2 width = 300 height = 570>
</applet>
*/

public class applet_2 extends Applet
{
	
	public void paint(Graphics g)
	{
	g.setColor(Color.RED);	
	{int x[]={100,200,150};
	int y[]={400,400,350};
	g.fillPolygon(x,y,3);			//Triangle

	int a[]={100,200,250,50};
	int b[]={500,500,550,550};
	g.fillPolygon(a,b,4);}			//Base 2

	g.setColor(Color.yellow);
	{g.fillRect(100,400,100,100);		//Body
	g.fillRect(100,550,100,10);}		//Base 1

	g.setColor(Color.gray);
	{g.fillOval(127,425,45,55);}		//Window

	setBackground(Color.black);

	g.setColor(Color.white);		//stars
	{
	g.fillOval(80,75,5,5);
	g.fillOval(225,33,5,5);
	g.fillOval(130,150,5,5);
	g.fillOval(25,200,7,7);
	g.fillOval(275,265,5,5);
	g.fillOval(200,310,5,5);
	g.fillOval(75,445,7,7);
	g.fillOval(255,500,5,5);
	g.fillOval(33,300,3,3);
	
	
	}

	}
}