import java.util.*;
class Area
{
int l,b;
Area(int x,int y)
{
l=x;
b=y;
}
Area(Area ob)
{
l=ob.l;
b=ob.b;
}
int showArea()
{
return(l*b);
}
};
class Copyconst
{
public static void main(String arg[])
{
Area o=new Area(10,5);
Area o1=new Area(o);
System.out.println("Area of Rectangle:"+o.showArea());
System.out.println("Area of Rectangle:"+o1.showArea());
}
}

