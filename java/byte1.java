import java.util.Scanner;
class byte1
{
public static void main(String args[])
{
	int a,b[],c,i=0;
	b=new int[10];
	System.out.print("enter the number");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	if(a<=3)
	{
		c=a%2;
		b[i]=c;
		i++;
		b[i]=1;
	}
	else
	{
		while(a!=0)
		{
			c=a%2;
			b[i]=c;
			i++;
			if(a==0)
			{
				b[i]=1;
			}
			else
			{
				a=a/2;
				
			}
		}
	}
	for(int j=i;j>=0;j--)
	{
		System.out.print(b[j]);
	}
}
}