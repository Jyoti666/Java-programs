import java.util.*;
class arraylist{
	public static void main(String args[])
	{
		int n=5;
		ArrayList<Integer> arraylist1=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++){
			arraylist1.add(i);
		}
		System.out.println("arraylist value: "+arraylist1);
		arraylist1.remove(3);
	    System.out.println("after remove :"+n);
	}

}