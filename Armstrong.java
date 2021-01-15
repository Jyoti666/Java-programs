import java.util.*;
class A
{
int n,temp,r,sum=0;
void show()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
n=s.nextInt();
temp=n;

while(n!=0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(temp==sum)
System.out.println(temp+" is a armstrong");
else
System.out.println(temp+" is not a armstrong");
}
};
class Armstrong
{
public static void main(String arg[])
{
A ob=new A();
ob.show();
}
}