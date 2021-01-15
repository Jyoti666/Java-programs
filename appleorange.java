import java.util.*;
class appleorange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s,t,a,b,m,n,acount=0,ocount=0;
       
        System.out.println("Enter for s and t:");
        String home[]=sc.nextLine().split(" ");
        s=Integer.parseInt(home[0]);
        t=Integer.parseInt(home[1]);
        System.out.println("Enter for a and b:");
        String tree[]=sc.nextLine().split(" ");
        a=Integer.parseInt(tree[0]);
        b=Integer.parseInt(tree[1]);
        System.out.println("Enter m and n:");
        String mn[]=sc.nextLine().split(" ");
        m=Integer.parseInt(mn[0]);
        n=Integer.parseInt(mn[1]);

        System.out.println("Enter "+m+" values:");
        String aarray[]=sc.nextLine().split(" ");
        
        System.out.println("Enter "+n+" values:");
        String oarray[]=sc.nextLine().split(" ");

        for(int i=0;i<m;i++){
          if(a+Integer.parseInt(aarray[i]) >= s && a+Integer.parseInt(aarray[i]) <= t)
             acount+=1;
        }
        for(int i=0;i<n;i++){
          if(b+Integer.parseInt(oarray[i]) >=s && b+Integer.parseInt(oarray[i]) <= t)
             ocount+=1;
        }
        System.out.println(acount);
        System.out.println(ocount);


        


    }
}