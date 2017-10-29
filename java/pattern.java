import java.util.Scanner;
class pattern
{
public static void main(String args[])
{
int n=10;
//Scanner s=new Scanner(System.in);
//int n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=n-i;j>=0;j--)
{
if(i==j)
{
System.out.print("1 ");
for(int k=0;k<i;k++)
{
System.out.print("  1 ");
}
}
else
System.out.print(" ");
}
System.out.print("\n");
}
}}