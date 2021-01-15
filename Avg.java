import java.io.*;
class A
{
int a,b,c,d,e,avg;
void getdata(int f,int g,int h,int i,int j)
{
a=f;
b=g;
c=h;
d=i;
e=j;
avg=(a+b+c+d+e)/5;
}
void showdata()
{
System.out.println("Average of five numbers="+avg);
}
};
class Avg
{
public static void main(String ar[])throws IOException
{
int k,l,m,n,o;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
A ob=new A();
System.out.println("Enter five value:");
k=Integer.parseInt(br.readLine());
l=Integer.parseInt(br.readLine());
m=Integer.parseInt(br.readLine());
n=Integer.parseInt(br.readLine());
o=Integer.parseInt(br.readLine());
ob.getdata(k,l,m,n,o);
ob.showdata();
}
}

