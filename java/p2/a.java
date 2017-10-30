
import java.util.Scanner;
import p1.*;
class a 
{
public static void main(String args[])
{
int n,a;
Scanner s=new Scanner(System.in);
System.out.print("enter the limit of the array");
n=s.nextInt();
System.out.print("\n");
stat st=new stat(n);
for(int i=0;i<n;i++)
{
//System.out.print("enter the number");
//a=s.nextInt();
a=i+1;
st.push(i,a);
}
for(int i=0;i<n;i++)
{
st.pop(i);
}

}}
