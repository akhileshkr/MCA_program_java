/*<applet code="panel" width=1200 height=1200>
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class panel extends Applet implements ActionListener
{
	Button bpre,bnext;
	Panel p,p1,p2;
	Checkbox ch1,ch2;
	List l1;
	TextField t1;
	CardLayout cl;
	public void init()
	{
		cl=new CardLayout();
		l1=new List(3,true);
		t1=new TextField(10);
		l1.add("apple");
		l1.add("orenge");
		l1.add("grapes");
		l1.add("guva");
		l1.add("mango");
		bpre=new Button("previous");
		bnext=new Button("next");
		p=new Panel();
		add(bpre);
		add(bnext);
		add(p);
		p.setLayout(cl);
		p1=new Panel();
		p2=new Panel();
		p1.add(l1);
		ch1=new Checkbox("apple",true);
		ch2=new Checkbox("orenge",false);
		p1.add(ch1);
		p1.add(ch2);
		p2.add(t1);
		p.add(p1,"previous");
		p.add(p2,"next");
		bpre.addActionListener(this);
		bnext.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("previous"))
		{
			cl.show(p,"previous");
		}
		else
		{
			cl.show(p,"next");
		}
	}
}