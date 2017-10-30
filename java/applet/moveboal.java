/*<applet code="moveboal" width=1200 height=600>
</applet>*/
import java.awt.*;
import java.applet.*;
public class moveboal extends Applet implements Runnable
{
	Thread t;
	int j=0,ab,ab1;
	Boolean f=true;
	public void init()
	{
		t=new Thread(this);
		t.start();
		
	}
	public void run()
	{
		while(f)
		{ab=this.getWidth();
		ab1=this.getHeight();
			if(j==0)
			{
				for(int i=0;i<ab;i++)
				{
					j=i;
					try
					{
						Thread.sleep(20);
						repaint();
					}
					catch(Exception e)
					{
						//System.out.println(e);
					}
				}
			}
			else
			{
				for(int i=ab;i>=0;i--)
				{
					j=i;
					try
					{
						Thread.sleep(20);
						repaint();
					}
					catch(Exception e)
					{
						//System.out.println(e);
					}
				}
			}
		}
	}
	public void paint(Graphics g)
	{
		g.drawOval(j,100,100,100);
		
	}
	public void destroy()
	{
		f=false;
	}
}