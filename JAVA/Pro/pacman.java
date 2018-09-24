import java.applet.*;
import java.awt.*;
/*
<applet code=pacman width=500 height=500>
</applet>
*/
public class pacman extends Applet implements Runnable
{
	Thread t;
	int i;
	public void init()
	{
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
				Thread.sleep(25);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		
		g.setColor(Color.gray);			//eye
		{g.fillOval(250,195,10,10);}	

		g.setColor(Color.yellow);		//Head
		{g.fillArc(150,150,200,200,40-i,290+i);}

		


		g.setColor(Color.yellow);
		{
			if(i>=0 && i<=40)
			g.fillArc(150,150,200,200,40-i,290+i);

		else if(i>=20 && i<=60)
			g.fillArc(150,150,200,200,i-40,290+i);
			
		else
			i=0;
		}
	}
}