import java.util.Scanner;
public class strpalin
{
 public static void main(String[] args)
 {
  String s,s1="";
  boolean res;
  Scanner obj=new Scanner(System.in);
  System.out.print("Enter a word : ");
  s=obj.nextLine();
  s1=reverse(s);
  res=equal(s,s1);
  if(res==true)
   System.out.println("The string is Palindrome");
  else
   System.out.println("The string is NOT Palindrome");
 }
 
 public static String reverse(String rev)
 {
  String s,s1="";
  int i,len;
  char ch;
  s=rev;
  len=s.length();
  for(i=len-1;i>=0;i--)
  { 
   ch=s.charAt(i);
   s1=s1+ch;
  }
  return (s1);
 }
 public static boolean equal(String i, String j)
 { 
  String s,s1;
  s=i;
  s1=j;
  if(s.equalsIgnoreCase(s1))
   return true;
  else
   return false;
 }
}