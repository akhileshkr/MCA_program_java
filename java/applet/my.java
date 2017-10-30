import java.awt.*;
import java.applet.*;
public class my extends Applet implements Runnable 
{
	String msg="hai hello";
	Boolean f=true;
	int i=0,j=100;
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(f)
		{
			for(int k=0;k<1400;k++)
			{
				i++;
				try
				{
				Thread.sleep(20);
					repaint();
				}
				catch(Exception e)
				{
				}
			}
			i=0;
		}
	}
	public void paint(Graphics g) 
	{
		g.drawString(msg,i,j);
	}
	public void destroy()
	{
		f=false;
	}
}
