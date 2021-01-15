import java.util.*;
class Atriangle
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
double area,p,a,b,c;
System.out.println("Enter 3 sides of a triangle:");
a=s.nextDouble();
b=s.nextDouble();
c=s.nextDouble();
p=(a+b+c)/2;
area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
System.out.format("Area of Triangle="+area);
}
}