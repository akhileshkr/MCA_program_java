import java.util.Scanner;
class person
{
String name,add;
int age;
person(String n,String a,int b)
{
name=n;
age=b;
add=a;
}
void display()
{
System.out.println("name="+name);
System.out.println("address="+add);
System.out.println("age="+age);
}
}
class student extends person
{
int roll;
String course;
student(String n,String a,int b,int r,String c)
{
super(n,a,b);
roll=r;
course=c;
}
void display()
{
super.display();
System.out.println("roll no="+roll);
System.out.println("course="+course);

}
}
class mark extends student
{
float smark,imark,emark,tot;
mark(float sm,float im,float em,String n,String a,int b,int r,String c)
{
super(n,a,b,r,c);
smark=sm;
imark=im;
emark=em;
}
void display()
{
super.display();
System.out.println("sports mark="+smark);
System.out.println("internal mark="+imark);
System.out.println("external mark="+emark);
}
float cal()
{
tot=smark+imark+emark;
return tot;
}
}
class exam
{
public static void main(String args[])
{
System.out.println("enter the details of the student");
System.out.println("enter the name of the student:");
Scanner s=new Scanner(System.in);
String name=s.next();
System.out.println("enter the address of the student:");
String add=s.next();
System.out.println("enter the age of the student:");
int age=s.nextInt();
System.out.println("enter the roll no of the student:");
int roll=s.nextInt();
System.out.println("enter the course of the student:");
String course=s.next();
System.out.println("enter the sports mark:");
float sm=s.nextFloat();
System.out.println("enter the internal mark:");
float im=s.nextFloat();
System.out.println("enter the external mark:");
float em=s.nextFloat();
mark m=new mark(sm,im,em,name,add,age,roll,course);
System.out.println("details of the student");
m.display();
System.out.println("total mark="+m.cal());
}
}