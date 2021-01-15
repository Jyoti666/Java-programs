import java.util.Scanner;
class Bubblesort
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int n,i,temp,r=1,j=1;
System.out.println("Enter The Size Of The Array:");
 n=s.nextInt();
 int arr[]=new int[n];
 System.out.println("Enter The Value Of The Array:");
 for(i=0;i<n;i++)
 {
 arr[i]=s.nextInt();
 }
  while(r!=0)
 {
 r=0;
 System.out.println("STEP-"+j);
 for(i=0;i<(n-1);i++)
 {
 if(arr[i]>arr[i+1])
 {
 temp=arr[i];
 arr[i]=arr[i+1];
 arr[i+1]=temp;
 r=1;
 System.out.print(arr[i]+" ");
 }
 else
 {
	 System.out.print(arr[i]+" ");
}
}
 System.out.print(arr[n-1]);
 System.out.println();
 j++;
 }
 System.out.println("AFTER SORTING:");
 for(i=0;i<n;i++)
 {
 System.out.print(arr[i]+" ");
}
}
}