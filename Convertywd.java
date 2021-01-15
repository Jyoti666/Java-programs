import java.util.Scanner;
class Convertywd
{
public static void main(String arg[])
{
int n,year=0,week=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter Days:");
n=s.nextInt();
while(n>364)
{
year++;
n-=365;
}
while(n>6)
{
week++;
n-=7;
}
System.out.println("No. of Year="+year);
System.out.println("No. of Weeks="+week);
System.out.println("No. of Days="+n);
}
}