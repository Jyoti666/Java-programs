// To count number of setbits in a integer 
import java.util.Scanner;
class Countbits
{
public static void main(String arg[])
{
int n,count=0,temp;
Scanner s=new Scanner(System.in);
System.out.println("Enter a integer number");
n=s.nextInt();
temp=n;
while(n!=0)
{
	n=n&(n-1);
	count++;
}
System.out.println("Number of setbits in "+temp+" is "+count);
}
}
