import java.util.*;
class A
{
double x,y,r,theta;
void setData(double a,double b)
{
x=a;
y=b;
}
void showData()
{
r=Math.sqrt(x*x+y*y);
theta=Math.atan(y/x);
System.out.println("The valu in polar coordinate:");
System.out.println("r="+r);
System.out.println("theta="+theta);
}
};
class Cartecian2polar
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
double c,d;
A ob=new A();
System.out.println("Enter the 2 value for cartecian coordinate:");
c=s.nextDouble();
d=s.nextDouble();
ob.setData(c,d);
ob.showData();
}
}