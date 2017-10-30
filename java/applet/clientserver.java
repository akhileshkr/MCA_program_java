import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class clientserver extends JFrame implements ActionListener
{
 Container con=this.getContentPane();
 JPanel pane=new JPanel();
 JLabel type=new JLabel("Message REceived");
 BufferedReader in=null;
 String msg=null;
 JTextArea t=new JTextArea("",10,25);


 String ipadd="localhost";
 Scanner sca=new Scanner(System.in);
 JLabel type1=new JLabel("Type message");
 JLabel re=new JLabel("result");
 JButton sendmsg=new JButton("Sendmsg"); 
 JTextField t1=new JTextField(10);
PrintWriter out=null;


 clientserver()
{
 super("ClientServer");
 setBounds(400,400,500,500);
 con.add(pane);
 pane.add(type1);
 pane.add(re);
 pane.add(t1);
 pane.add(sendmsg);

 setBounds(600,600,500,500);
 pane.add(type);
 pane.add(t);

 sendmsg.addActionListener(this);
 setVisible(true);
// ipadd=sca.next();

try
{
 ServerSocket ss=new ServerSocket(8000);
 Socket echo=ss.accept();
  in =new BufferedReader(new InputStreamReader(echo.getInputStream()));
Socket echo1=new Socket(ipadd,8000);
 out=new PrintWriter(echo1.getOutputStream(),true);
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
  new c();
}
 public static void main(String args[])
 {
  new clientserver();
 }
 }