import java.util.*;
class Arrayli
{
	public static void main(String args[])
	{
	ArrayList<Integer> arr=new ArrayList<>();
	System.out.println(arr.size());
	arr.add(new Integer(1));
	arr.add(new Integer(2));
	Object a[]=arr.toArray();
	int sum=0;

    for(int i=0;i<a.length;i++)
	{
	sum+=((Integer)a[i]).intValue();;
	}
	System.out.println(sum);
		}
}