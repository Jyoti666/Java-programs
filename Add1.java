import java.util.*;
class Add1
{
public static void main(String arg[])
{
int n,i=4,r=0,temp,a,j;
int arr[]=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("Enter a 5-digit number:");
n=s.nextInt();
temp=n;
while(n!=0)
{
r=n%10;
arr[i]=r+1;
i--;
n=n/10;
}
for(i=4;i>=0;i--)
{
if(arr[i]>=10)
{
n=arr[i];
r=n/10;
j=i-1;
arr[j]=arr[j]+r;
a=n%10;
arr[i]=a;
}
}
System.out.println("BEFORE ADDING 1 TO EACH DIGIT:"+temp);
System.out.print("AFTER ADDING 1 TO EACH DIGIT:");
for(i=0;i<5;i++)
{
System.out.print(arr[i]);
}
}
}
