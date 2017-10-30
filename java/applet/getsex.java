/*<applet code=getsex width=500 height=500>
</applet>*/
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class getsex extends Applet implements ActionListener
{
	Button b;
	Checkbox cm,cf,c;
	CheckboxGroup csex;
	public void init()
	{
		b=new Button("click");
		csex=new CheckboxGroup();
		cm=new Checkbox("male",csex,true);
		cf=new Checkbox("female",csex,false);
		b.addActionListener(this);
		add(b);
		add(cm);
		add(cf);
	}
	public void actionPerformed(ActionEvent e)
	{
		c=csex.getSelectedCheckbox();
		showStatus(c.getLabel());
		if(c==cm)
		{
			csex.setSelectedCheckbox(cf);
		}
		else
		{
			csex.setSelectedCheckbox(cm);
		}
	}
}