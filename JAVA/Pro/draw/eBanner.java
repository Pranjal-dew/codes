import java.applet.*;
import java.awt.*;
/*
<applet code=eBanner width=300 height=200>
</applet>
*/
public class eBanner extends Applet implements Runnable
{
	Thread t;
	String s="";
	Font f;
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.green);
		s="Tridib Kumar Paul * ";
		f=new Font("Arial", Font.PLAIN, 23);
		setFont(f);
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(; ; )
		{
			try
			{
				char c=s.charAt(0);
				s=s.substring(1);
				s=s+c;
				repaint();
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(s, 50, 100);
	}
}