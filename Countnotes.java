import java.util.*;
class Countnotes
{
public static void main(String arg[])
{
int n,n100,n50,n10,n5,n2,n1,temp;
Scanner s=new Scanner(System.in);
System.out.println("Enter a value:");
n=s.nextInt();
temp=n;
n100=n/100;
n=n%100;
n50=n/50;
n=n%50;
n10=n/10;
n=n%10;
n5=n/5;
n=n%5;
n2=n/2;
n=n%2;
n1=n/1;
System.out.println("To give "+temp+" amount of money,you have to give:");
System.out.println(n100+" number of 100 rupees notes");
System.out.println(n50+" number of 50 rupees notes");
System.out.println(n10+" number of 10 rupees notes");
System.out.println(n5+" number of 5 rupees notes");
System.out.println(n2+" number of 2 rupees notes");
System.out.println(n1+" number of 1 rupees notes");
}
}