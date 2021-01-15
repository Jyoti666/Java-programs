import java.util.*;
class Area
{
int l,b,r;
Area()
{
l=20;
b=25;
}
Area(int x,int y)
{
l=x;//for out dclr
b=y;
}
Area(int x)
{
r=x;
}
void rDisplay()
{
System.out.println("Area of Rectangle="+l*b);
}
void tDisplay()
{
System.out.println("Area of Triangle="+l*b/2);
}
void cDisplay()
{
System.out.println("Area of Circle="+(22/7*r*r));
}
};
class Constover
{
public static void main(String arg[])
{
Area ob=new Area();
Area ob1=new Area(20,30);
Area ob2=new Area(20);
ob.rDisplay();
ob1.tDisplay();
ob2.cDisplay();
}
}