import java.io.*;
class A
{
int a,b,area;
void getData(int x,int y)
{
a=x;
b=y;
//return(a*b);
}
void s()
{

//area=a*b;
System.out.println("Area of rectangle="+(a*b));
//return(a*b);
}
};
class Area
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
A ob=new A();
ob.getData(50,45);
//System.out.println("Area of rectangle="+ob.s());
ob.s();
}
}