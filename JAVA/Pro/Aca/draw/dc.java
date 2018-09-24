import java.applet.*;
import java.awt.*;
import java.util.*;
/*
<applet code=dc width=300 height=200>
</applet>
*/
public class dc extends Applet implements Runnable
{
	Thread t;
	int h, m, s;
	Font f;
	Calendar cal;
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.green);
		cal=Calendar.getInstance();
		h=cal.get(Calendar.HOUR);
		m=cal.get(Calendar.MINUTE);
		s=cal.get(Calendar.SECOND);
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
		String dt=cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR);
		g.drawString(tm, 50, 100);
		g.drawString(dt, 50, 130);
		showStatus("Today is : " + new Date());
	}
}