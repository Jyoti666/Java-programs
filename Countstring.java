import java.util.Scanner;
class Countstring
{
public static void main(String arg[])
{
String s;
int l,i,vowel=0,digit=0,word=1,cha=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
s=sc.nextLine();
l=s.length();
for(i=0;i<l;i++)
{
  if(s.charAt(i)>='0' && s.charAt(i)<='9' )
  {
     digit++;
  }
  else
  {
	 if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
       vowel++;
     if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
	    cha++;
     if(s.charAt(i)==' ')
	    word++;
  }  
}
System.out.println("VOWELS:"+vowel);
System.out.println("DIGIT:"+digit);
System.out.println("CHARACTER:"+cha);
System.out.println("WORDS:"+word);
}
}