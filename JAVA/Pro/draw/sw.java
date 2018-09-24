import java.applet.*;
import java.awt.*;
/*
<applet code=sw width=300 height=200>
</applet>
*/
public class sw extends Applet implements Runnable
{
	Thread t;
	int h, m, s;
	Font f;
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.green);
		h=m=s=0;
		f=new Font("Arial", Font.PLAIN, 23);
		setFont(f);
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(; ; s++)
		{
			try
			{
				if(s>=60)
				{
					m++;
					s-=60;
				}
				if(m>=60)
				{
					h++;
					m-=60;
				}
				repaint();
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		String tm=h + " : " + m + " : " + s;
		g.drawString(tm, 50, 100);
	}
}