import java.util.Scanner;
class Amicablepairs
{
public static void main(String arg[])
{
int i,j,sum=0,k,sum2=0,n,n2;
Scanner s=new Scanner(System.in);
System.out.println("Enter The Numbers For Amicable Pairs:");
n=s.nextInt();
n2=s.nextInt();
System.out.println("Amicable Pairs Between 1-1000 Are:");
for(i=n;i<=n2;i++)
{
for(j=1;j<i;j++)
{
if(i%j==0)
{
sum+=j;
}
}
for(k=1;k<sum;k++)
{
if(sum%k==0)
{
sum2+=k;
}
}
if(i==sum2)
{
  System.out.print("("+i+","+sum+")");
}
sum=0;
sum2=0;
}
}
}   