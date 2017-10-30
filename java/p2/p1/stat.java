package p1;
import java.util.Scanner;
public class stat
{
int n;
int a[];
public stat(int x)
{
n=x;
a=new int[n];
}

public void push(int i,int b)
{
a[i]=b;
}
public void pop(int i)
{
System.out.println(a[i]);
}
}