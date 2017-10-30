import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=Freedraw Width=500 Height=500>
</applet>*/
public class Freedraw extends Applet implements MouseMotionListener
{
	int x,y;
	String msg="*";
	public void init()
	{
		this.addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent e)
	{}
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		Graphics g=getGraphics();
		g.drawString(msg,x,y);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}
		