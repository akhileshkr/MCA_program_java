import java.awt.*;
import java.applet.*;
public class myapplet extends Applet implements Runnable
{
	
	String msg="hai hello";
	public void init()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(;;)
		{
		for(int i=msg.length();i>=0;i--)
			{
			msg=msg.substring(0,i);
			repaint();
			try
			{
				Thread.sleep(1000);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}}msg="hai hello";
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,200);
	
	}
}