class piramid
{
public static void main(String args[])
{
for(int i=0;i<10;i++)
	{
	

	for(int j=10;j>0;j--)
		{
		if(i==j)
		{
		System.out.print("1");
		}
		else
{
		System.out.print(" ");
}
		for(int k=0;k>i;k++)
			{
			System.out.print("1");
			}
		}
	System.out.print("\n");
	}
}
}