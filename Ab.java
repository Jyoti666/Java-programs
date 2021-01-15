import java.util.*;
class Ab
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
Ab ob=new Ab();
ob.show();
}
}
