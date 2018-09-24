import java.applet.*;
import java.awt.*;
/*
<applet code=gana width=500 height=500>
<param name=abc value=b.wav>
</applet>
*/
public class gana extends Applet
{
	AudioClip i1, i2;
	public void init()
	{
		i1=getAudioClip( getDocumentBase(), "a.au");
		i2=getAudioClip( getDocumentBase(), getParameter("abc"));
		i1.play(); //Once
		// i2.loop();	// Continuous
		// i2.stop();
	}
}