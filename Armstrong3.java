import java.util.Scanner;
class Armstrong3
{
public static void main(String arg[])
{
int n=1,a,b,c,x;
while(n<=500)
{
a=n%10;
x=n/10;
b=x%10;
x=x/10;
c=x%10;
if(n==(a*a*a)+(b*b*b)+(c*c*c))
System.out.println(n);
n++;
}
}
}