import java.util.*;
class Abc
{
int a=5,b;
void getdata()
{
b=a;
}
void show()
{
System.out.println("b="+b);
}
};
class B
{
public static void main(String arg[])
{
Abc ob=new Abc();
ob.show();
}
}
