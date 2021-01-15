import java.util.*;
class Array
{
	public static void main(String args[]){
	int arr[]={2,5,7,5};
	int n=0,count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number for search:");
    n=s.nextLine;
	for(int i=0;i<4;i++){
	  if(arr[i]==n)
	     count=1;
	}
	if(count!=0)
	   System.out.println("Number exist");
	else
	   System.out.print("Number is not exist");
	}
}