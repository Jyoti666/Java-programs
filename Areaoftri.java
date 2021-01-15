import java.util.Scanner;
import java.lang.Math;
class Areaoftri
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double a,b,c,area,s;
System.out.println("Enter three sides of the Triangle:");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area Of Triangle="+area);
}
}