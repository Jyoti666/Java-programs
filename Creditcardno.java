import java.io.*;
class A
{
int arr[]=new int[]{4,5,6,7,1,2,3,4,5,6,7,8,9,1,2,9};
int arr1[]=new int[8];
int sum=0,sum1=0,sum2=0,j=0,i;
A()
{
for(i=0;i<16;i++)
{
arr1[j]+=2*arr[i];
sum1+=arr[++i];
j++;
}
i=0;
while(i<8)
{
if(arr1[i]>=10)
   arr1[i]-=9;
i++;
}
i=0;
while(i<8)
{
sum2+=arr1[i];
i++;
}
System.out.println("sum1="+sum1);
System.out.println("sum2="+sum2);
sum=sum1+sum2;
if(sum%10==0)
   System.out.println("It is a valid Number");
else
   System.out.println("It is not a valid Number");
}
}
class Creditcardno
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
A ob=new A();
}
}