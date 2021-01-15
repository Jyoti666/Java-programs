import java.util.*;
class A
{
int temp,r,sum=0;
int check(int n)
{
temp=n;

while(n!=0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(temp==sum)
return 1;//System.out.println(temp+" is a armstrong");
else
return 0;//System.out.println(temp+" is not a armstrong");
}
};
class Armstrong2
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
int n=s.nextInt();
A ob=new A();
int res=ob.check(n);
if(res==1)
System.out.println("It is a armstrong");
else
System.out.println("It is not a armstrong");
}
}