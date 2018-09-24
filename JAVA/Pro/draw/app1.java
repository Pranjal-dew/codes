import java.applet.*;
import java.awt.*;
/*
<applet code=app1 width=200 height=200>
</applet>
*/
public class app1 extends Applet
{
	Font f;
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.YELLOW);
		f=new Font("Arial", Font.PLAIN, 23);
		setFont(f);
	}
	public void paint(Graphics g)
	{
		g.drawString("Tridib", 50, 100);
		g.setColor(Color.green);
		g.drawString("Paul", 50, 130);
		showStatus(" Welcome !! ");
	}
}