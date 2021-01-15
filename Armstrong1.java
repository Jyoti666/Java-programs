import java.util.Scanner;
class Armstrong1
{
public static void main(String arg[])
{
int t,sum,r;
System.out.println("Armstrong Numbers Between 1-500:");
for(int i=1;i<=500;i++)
{
t=i;
sum=0;
while(i>0)
{
r=i%10;
sum=sum+r*r*r;
i=i/10;
}
i=t;
if(sum==t)
System.out.println(t);
}
}
}
