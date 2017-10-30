import java.applet.*;
import java.awt.*;
public class face extends Applet 
{
	public void paint(Graphics g)
	{
//head
		g.setColor(Color.black);
		g.drawOval(100,100,200,200);
//eye
		g.setColor(Color.black);
		g.drawOval(150,160,20,15);
		g.fillOval(158,163,10,10);
		g.drawOval(240,160,20,15);
		g.fillOval(248,163,10,10);
//nose
		g.drawLine(200,160,190,200);
		g.drawLine(190,200,200,200);
//lip
		g.drawArc(150,200,100,60,180,180);
//ear
		g.drawArc(90,180,20,40,90,180);
		g.drawArc(290,180,20,40,270,180);
//body
		g.drawLine(153,290,153,330);
		g.drawLine(240,290,240,330);
	}
}