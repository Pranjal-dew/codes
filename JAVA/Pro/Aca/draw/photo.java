import java.applet.*;
import java.awt.*;
/*
<applet code=photo width=500 height=500>
<param name=abc value=b.jpg>
</applet>
*/
public class photo extends Applet
{
	Image i1, i2;
	public void init()
	{
		i1=getImage( getDocumentBase(), "a.jpg");
		i2=getImage( getDocumentBase(), getParameter("abc"));
	}
	public void paint(Graphics g)
	{
		g.drawImage(i1, 10, 50, this);
		g.drawImage(i2, 210, 20, this);
		showStatus(" Dikhis !! ");
	}
}