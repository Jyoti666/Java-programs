import java.util.*;
class student{
	String name;
	String branch;
	int regno;
	void setData(String sname,String sbranch,int sregno){
	name=sname;
	branch=sbranch;
	regno=sregno;
	}
	void showData(){
	System.out.println("Name:"+name);
	System.out.println("Branch:"+branch);
	System.out.println("REGD NO:"+regno);
	}
}
class arrayclas
{
	public static void main(String args[]){
	student s[]=new student[2];
	s[0].setData("jyoti","ITM",18);
	s[1].setData("chintu","ITM",19);
	System.out.println("1 data:");
	s[0].showData();
	}
}
