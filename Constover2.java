import java.util.*;
class Area
{
int l,b;
Area()
{
l=20;
b=15;
}
Area(int x)
{
l=x;
b=30;
}
Area(int x,int y)
{
l=x;
b=y;
}
void display()
{
System.out.println("Area of Rectangle="+l*b);
}
};
class Constover2
{
public static void main(String ar[])
{
Area ob=new Area();
Area ob1=new Area(20);
Area ob2=new Area(20,30);
ob.display();
ob1.display();
ob2.display();
}
}