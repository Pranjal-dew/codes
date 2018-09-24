import java.applet.*;
import java.awt.*;
/*
<applet code=ball width=300 height=500>
</applet>
*/
public class ball extends Applet implements Runnable
{
	Thread t;
	int i;
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.yellow);
		i=0;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(; ; i++)
		{
			try
			{
				repaint();
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		if(i>=0 && i<=400)
			g.fillOval(100, 400-i, 100, 100);
		else if(i>400 && i<=800)
			g.fillOval(100, i-400, 100, 100);
		else
			i=0;
	}
}