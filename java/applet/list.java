/*<applet code=list width=500 height=500>
</applet>*/
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class list extends Applet implements ItemListener
{
	Button b;
	Choice c;
	CheckboxGroup csex;
	public void init()
	{
		b=new Button("click");
		c=new Choice();
		c.addItem("abhijith");
		c.addItem("akhilesh");
		c.addItem("arun");
		c.addItem("aravind");
		c.addItem("bibin");
		c.addActionListener(this);
		add(b);
		add(c);
	}
	/*public void actionPerformed(ActionEvent e)
	{
		String str=e.getSelectedIteem();showStatus(c.getLabel());
		
		if(c==cm)
		{
			csex.setSelectedCheckbox(cf);
		}
		else
		{
			csex.setSelectedCheckbox(cm);
		}
	}*/
	public void ItemStateChanged(ItemEvent e)
	{
		String str=e.getSelectedIteem();
		showStatus(str);
	}
}