import java.applet.*;
import java.awt.*;
/*
<applet code=draw2 width=500 height=500>
</applet>
*/
public class draw2 extends Applet
{
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		for(int i=0; i<=100; i+=2)
			g.drawRect(50+i, 100+i, 200-2*i, 200-2*i);
		showStatus(" Pyramid !! ");
	}
}