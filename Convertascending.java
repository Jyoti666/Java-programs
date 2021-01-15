import java.util.Scanner;
class Convertascending
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int size,i,j,count=0,sm=0;
String small=" ";
System.out.println("Enter the Size of the 2 Array:");
size=s.nextInt();
String svalue[]=new String[size];
int ivalue[]=new int[size];
System.out.println("Enter the "+size+" Integer Value and "+size+" String Value One After Another:");
for(i=0;i<size;i++)
{
ivalue[i]=s.nextInt();
svalue[i]=s.nextLine();
}
System.out.println();
for(i=0;i<size-1;i++)
{
small=svalue[i];
for(j=i+1;j<size;j++)
{
if(small.compareTo(svalue[j])>0)
{
small=svalue[j];
count=j;
}
}
if(small!=svalue[i])
{
svalue[count]=svalue[i];
svalue[i]=small;
}
}
count=0;
for(i=0;i<(size)-1;i++)
{
sm=ivalue[i];
for(j=i+1;j<size;j++)
{
if(sm>ivalue[j])
{
sm=ivalue[j];
count=j;
}
}
if(sm!=ivalue[i])
{
ivalue[count]=ivalue[i];
ivalue[i]=sm;
}
}
System.out.println("After Sorting in Ascending Order:");
for(i=0;i<size;i++)
{
System.out.print(svalue[i]+" "+ivalue[i]+" ");
}
}
}