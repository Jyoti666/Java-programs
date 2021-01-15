import java.io.*;
class A
{
int arr[]=new int[8];
int n,sum=0,sum1=0,sum2=0,j=0;
A(int a)
{
n=a;
for(i=1;i<=16;i+2)
{
sum1+=(n%10);
n/=10;
arr[j]+=(n%10);
j++;
n/=10;
}
i=0;
while(i<8)
{
if(arr[i]>10)
   arr[i]-=9;
i++;
}
i=0;
while(i<8)
{
aum2+=arr[i];
i++;
}
sum=sum1+sum2;
if(sum%10==0)
   System.out.println("It is a valid Number");
else
   System.out.println("It is not a valid Number");
}
class Creditcardno.
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new Input StreamReader(System.in));
A ob=new A(4567123456789129);
}
}