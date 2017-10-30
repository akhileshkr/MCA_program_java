class chat
{
 public static void main(String args[])
 {
  Server s=new Server();
 Client c=new Client();
Thread t1=new Thread(s);
Thread t2=new Thread(c);
t1.strat();
t1.sleep(100);
t2.start();
t2.sleep(100);
 }
}