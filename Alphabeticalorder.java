import java.util.Scanner;
class Alphabeticalorder
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
String arr[]=new String[6];
String temp;
System.out.println("Enter 10 string:");
for(int i=0;i<6;i++)
{
arr[i]=s.nextLine();
}
int a,b,c,k;
for(int i=0;i<6;i++)
{
for(int j=i+1;j<6;j++)
{
k=0;
int d=1;
if((arr[i].length())<(arr[j].length()))
  {
 c=arr[i].length();
 
}
else
   c=arr[j].length();
while(k<c && d==1)
{
a=arr[i].charAt(k);
b=arr[j].charAt(k);
if(a>=b)
{
if(a>b)
{

temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
d=0;

}
}
else
   d=0;
k++;
}
}
}
System.out.println("After Order in Alphabetically:");
for(int i=0;i<6;i++)
{
System.out.println(arr[i]);
}
}
}
