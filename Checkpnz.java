import java.util.Scanner;
class Checkpnz
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int z=0,p=0,n=0,a,b=0;
System.out.println("Enter numbers as long as you required,and enter 1 for stop it:");
a=s.nextInt();
while(a!=1)
{
b++;
if(a>0)
p++;
else
{
if(a<0)
n++;
else
z++;
}
System.out.println("Enter next number:");
a=s.nextInt();
}
System.out.println("Total "+b+" number entered");
System.out.println("Possitive Numbers are "+p);
System.out.println("Negative Numbers are "+n);
System.out.println("Zeros are "+z);
}
}