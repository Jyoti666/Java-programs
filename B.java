import java.util.*;
class B
{
public static void main(String arg[])
{
int num=15;
boolean isprime=true;
for(int i=2;i<=num/2;i++)
{
if((num%i)==0)
{
isprime=false;
break;
}
}
if(isprime)
System.out.println("prime");
else
System.out.println("not prime");
}
}
