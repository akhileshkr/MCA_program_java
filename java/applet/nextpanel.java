/*<applet code="nextpanel" width=1200 height=1200>
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class nextpanel extends Applet implements ActionListener,MouseListener
{
	Button bfirst,bsecond,b1,b2;
	Panel p,p1,p2;
	Checkbox ch1,ch2;
	//List l1;
	//TextField t1;
	CardLayout cl;
	public void init()
	{
		addMouseListener(this);
		cl=new CardLayout();
		bfirst=new Button("first");
		bsecond=new Button("second");
		p=new Panel();
		add(bfirst);
		add(bsecond);
		add(p);
		p.setLayout(cl);
		p1=new Panel();
		p2=new Panel();
		b1=new Button("b1");
		b2=new Button("b2");
		p1.add(b1);
		p1.add(b2);
		ch1=new Checkbox("apple",true);
		ch2=new Checkbox("orenge",false);
		p2.add(ch1);
		p2.add(ch2);
		p.add(p1,"first");
		p.add(p2,"second");
		bfirst.addActionListener(this);
		bsecond.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("first"))
		{
			cl.show(p,"first");
		}
		else
		{
			cl.show(p,"second");
		}
	}
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseExited(MouseEvent e)
	{
	}
	public void mousePressed(MouseEvent e)
	{
		cl.next(p);
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
	}
}