/*<applet code="app1" width=1200 height=1200>
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class app1 extends Applet implements KeyListener
{
	String a="hai hello";
	int i=0;
	public void init()
	{
		TextField t=new TextField(11);
		add(t);
		t.addKeyListener(this);	
	}
	public void keyReleased(KeyEvent e)
	{
		
	}
	public void keyPressed(KeyEvent e)
	{
		
	}
	public void keyTyped(KeyEvent e)
	{
		e.setKeyChar(a.charAt(i));
		if(i==a.length())
		{
			i=0;
		}
		else
		{
			i=i+1;
		}
	}
}