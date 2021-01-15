import java.util.*;
class Alternate
{
public static void main(String arg[])
{
int ar[]=new int[]{1,2,3,4,5,6};
for(int i=0;i<6;i++)
System.out.print(ar[i]);
System.out.println();
for(int i=0;i<6;i+=2)
{
int b;
b=ar[i];
ar[i]=ar[i+1];
ar[i+1]=b;
}
for(int i=0;i<6;i++)
System.out.print(ar[i]);
}
}


