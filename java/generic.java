import java.util.Scanner;
class generic
{
<T>void inter(T x,T y)
{
System.out.println(x);System.out.println(y);
T t=x;
x=y;
y=t;
System.out.println(x);
System.out.println(y);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Integer a=s.nextInt();
Integer b=s.nextInt();
Float c=s.nextFloat();
Float v=s.nextFloat();
generic ge=new generic();
ge.<Integer>inter(a,b);
ge.<Float>inter(c,v);
}
}