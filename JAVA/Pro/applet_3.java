import java.awt.*;
import java.applet.*;
import java.awt.Graphics;

/*
<applet code = applet_3 width = 500 height = 500>
</applet>
*/

public class applet_3 extends Applet
{
	public void paint(Graphics g)
	{
	g.setColor(Color.yellow);		//Head
	{g.fillArc(150,150,200,200,40,290);}

	g.setColor(Color.gray);			//eye
	{g.fillOval(250,195,10,10);}	
	}
}