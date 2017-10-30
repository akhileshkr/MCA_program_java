import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class Client extends JFrame implements ActionListener
{
 String ipadd;
 Scanner sca=new Scanner(System.in);
 Container con=this.getContentPane();
 JPanel pane=new JPanel();
 JLabel type=new JLabel("Type message");
 JLabel re=new JLabel("result");
 JButton sendmsg=new JButton("Sendmsg"); 
 JTextField t1=new JTextField(10);
PrintWriter out=null;
 Client()
{
 super("Client");
 setBounds(400,400,500,500);
 con.add(pane);
 pane.add(type);
 pane.add(re);
 pane.add(t1);
 pane.add(sendmsg);
 sendmsg.addActionListener(this);
 setVisible(true);
 ipadd=sca.next();
try
{
 Socket echo=new Socket(ipadd,8000);
 out=new PrintWriter(echo.getOutputStream(),true);
}
catch(UnknownHostException e)
{
 System.err.println("Don't know about host");
 System.exit(1);
}
 catch(IOException e)
{
 System.err.println("couldn't get IO");
 System.exit(1);
} 
}
 
 public void actionPerformed(ActionEvent event)
 {
  String a;
 try
 { 
  a=t1.getText();
  out.println(a);
  t1.setText("");
 }
 catch(Exception e)
 { 
 System.err.println("couldn't get IO");
 System.exit(1);
 } 
 }

 public static void main(String args[])
{
  new Client();
 }
 }