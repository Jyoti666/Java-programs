import java.util.*;
class Test
{
int l,w;
Test()
{
l=10;
w=8;
}
void show()
{
System.out.println("Area of rectangle="+(l*w));
}
};
class Constructor1
{
public static void main(String ar[])
{
Test ob=new Test();
ob.show();
}
}