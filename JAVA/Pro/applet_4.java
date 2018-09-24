import java.awt.*;
import java.applet.*;
import java.awt.Graphics;

/*
<applet code = applet_4 width = 500 height = 500>
</applet>
*/

public class applet_4 extends Applet
{
	public void paint(Graphics g)
	{
	g.setColor(Color.orange);		
	{g.fillArc(150,150,200,200,0,90);}

	g.setColor(Color.green);		
	{g.fillArc(150,150,200,200,90,90);}

	g.setColor(Color.red);		
	{g.fillArc(150,150,200,200,180,90);}

	g.setColor(Color.blue);		
	{g.fillArc(150,150,200,200,270,90);}

	}
}