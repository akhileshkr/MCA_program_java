import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
public class Server extends JFrame
{
 Container con=this.getContentPane();
 JPanel pane=new JPanel();
 JLabel type=new JLabel("Message REceived");
 BufferedReader in=null;
 String msg=null;
 JTextArea t=new JTextArea("",10,25);
 Server()
{
 super("Server");
 setBounds(400,400,500,500);
 con.add(pane);
 pane.add(type);
 pane.add(t);
 setVisible(true);
 try{
 ServerSocket ss=new ServerSocket(8000);
 Socket echo=ss.accept();

  in =new BufferedReader(new InputStreamReader(echo.getInputStream()));
}catch(UnknownHostException e)
{
 System.err.println("Don't know about host");
 System.exit(1);
}
 catch(IOException e)
{
 System.err.println("couldn't get IO");
 System.exit(1);
}
 try{
 do
 {
  msg=in.readLine();
 t.append(msg+'\n');
 }while(!msg.equals("quit"));
 System.exit(1);
 }catch(IOException e)
 {
  System.err.println("couldn't get IO");
  System.exit(1);
 } 
 
}


 public static void main(String args[])
 {
  new Server();
 }
 }
