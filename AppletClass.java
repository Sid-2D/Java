import java.applet.*;
import java.awt.*;

public class AppletClass extends Applet {
	AudioClip a;
	Image i;
	public void init () {
		a = getAudioClip(getDocumentBase(), getParameter("Audio 1"));
		i = getImage(getDocumentBase(), getParameter("Image 1"));
	}
	public void start () {
		a.play();
	}
	public void paint (Graphics g) {
		g.drawString("Hello Applet", 100, 100);
		g.drawImage(i, 100, 100, this);
		g.drawOval(100, 200, 200, 200);
	}
}