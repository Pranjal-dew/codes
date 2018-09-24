import java.awt.*;
import java.applet.*;
import java.awt.Graphics;

/*
<applet code = applet_1 width = 300 height = 500>
</applet>
*/

public class applet_1 extends Applet
{
	public void init()
	{
	setBackground(Color.white)
	}

	public void paint(Graphics g)
	{
	g.setColor(Color.red);	
	g.fillOval(100,400,100,100);

	}
}