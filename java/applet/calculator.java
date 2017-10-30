/*<applet code=calculator width=200 height=200>
</applet>*/
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class calculator extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,bc;
	int x,y=0,u=1,z,m=0;
	public void init()
	{
		t1=new TextField(10);
		//t2=new TextField(10);
		//t3=new TextField(10);
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b11=new Button("+");
		b12=new Button("-");
		b13=new Button("*");
		b14=new Button("/");
		b10=new Button("=");
		bc=new Button("clear");
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		bc.addActionListener(this);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(bc);
		add(t1);
		//add(t2);
		//add(t3);
		t1.requestFocus();
	}
	public void actionPerformed(ActionEvent e)
	{
		
		Button b=(Button)e.getSource();
		if(b==b0)
		{
			u=1;
			t1.setText("0");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b1)
		{
			u=1;
			t1.setText("1");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b2)
		{
			u=1;
			t1.setText("2");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b3)
		{
			u=1;
			t1.setText("3");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b4)
		{
			u=1;
			t1.setText("4");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b5)
		{
			u=1;
			t1.setText("5");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}if(b==b6)
		{
			u=1;
			t1.setText("6");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b7)
		{
			u=1;
			t1.setText("7");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}if(b==b8)
		{
			u=1;
			t1.setText("8");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b9)
		{
			u=1;
			t1.setText("9");
			//t1.requestFocus();
			if(u==1)
			{
				x=Integer.parseInt(t1.getText());
				y=y*10+x;
				x=0;
				t1.setText(y+"");
			}
		}
		if(b==b10)
		{
			
			
			//t1.requestFocus();
			if(m==1)
			{
				z=y+z;
				t1.setText(z+"");
				m=0;
				
				x=0;
				y=z;	
			}
			if(m==2)
			{
				z=z-y;
				t1.setText(z+"");
				m=0;
				
				x=0;
				y=z;
			}if(m==3)
			{
				z=z*y;
				t1.setText(z+"");
				m=0;
				
				x=0;
				y=z;
			}if(m==4)
			{
				z=z/y;
				t1.setText(z+"");
				m=0;
				
				x=0;
				y=z;
			}
		}
		if(b==b11)
		{
			u=0;
			t1.requestFocus();
			if(u==0)
			{
				z=y;
				m=1;
				y=0;
			}
		}
		if(b==b12)
		{
			u=0;
			//t1.requestFocus();
			if(u==0)
			{
				z=y;
				m=2;
				y=0;
			}
		}
		if(b==b13)
		{
			u=0;
			//t1.requestFocus();
			if(u==0)
			{
				z=y;
				m=3;
				y=0;
			}
		}
		if(b==b14)
		{
			u=0;
			//t1.requestFocus();
			if(u==0)
			{
				z=y;
				m=4;
				y=0;
			}
		}
		if(b==bc)
		{
			u=1;
			t1.setText("");
			z=0;
			m=0;
			x=0;
			y=0;
		}
	}
}