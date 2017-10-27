import java.util.Scanner;
class am
{
int s,b,a,c,j;
	void ams(int n)
	{
	s=0;
	a=n;
	c=n;
	while(a!=0)
	{
	b=a%10;
	a=(a/10);
	j=b*b*b;
	s=s+j;

	}

	if(s==c)
	{
	System.out.println(s);
	}
}
}
class abc
{
public static void main(String args[])
{
am d=new am();
for(int i=1;i<=500;i++)
{
d.ams(i);
}
}
}