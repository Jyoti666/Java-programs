import java.util.Scanner;
class Daycheck
{
public static void main(String arg[])
{
int yr,refyr=2001,diff,lpyr,nmyr,td,day;
Scanner s=new Scanner(System.in);
System.out.println("Enter a year:");
yr=s.nextInt();
diff=yr-refyr;
lpyr=diff/4;
nmyr=diff-lpyr;
td=(nmyr*365)+(lpyr*366);
day=td%7;
if(day==0)
System.out.println("MONDAY");
else
 if(day==1)
  System.out.println("TUESDAY");
  else
    if(day==2)
      System.out.println("WED");
       else
         if(day==3)
           System.out.println("THU");
          else
            if(day==4)
 System.out.println("FRI");
else
 if(day==5)
System.out.println("SAT");
else
if(day==6)
System.out.println("SUN");
}
}