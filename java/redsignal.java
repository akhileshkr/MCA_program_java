import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.*;
public class redsignal extends Applet implements Runnable
{
int i=0;
public void init()
{
Thread animationthread=new Thread(this);
animationthread.start();
}
public void run()
{
for(;;)
{
repaint();
try{
 Thread.sleep(3000);
}catch(Exception e){
showStatus("Thread interrupt");
}
}
}
public void paint(Graphics g)
{
if(i==1)
{
i=0;
g.setColor(Color.red);
g.drawOval(100,100,50,50);
g.fillOval(100,100,50,50);
}
else
{
i=1;
g.setColor(Color.green);
g.drawOval(100,200,50,50);
g.fillOval(100,200,50,50);
}
g.setColor(Color.yellow);
g.drawOval(100,300,50,50);
g.fillOval(100,300,50,50);
g.setColor(Color.black);
g.drawRect(91,96,5,278);
g.fillRect(91,96,5,278);
g.drawRect(154,96,5,278);
g.fillRect(154,96,5,278);
g.drawRect(91,91,68,5);
g.fillRect(91,91,68,5);
g.drawRect(91,370,68,5);
g.fillRect(91,370,68,5);
g.drawRect(115,370,20,75);
g.fillRect(115,370,20,75);
}
}