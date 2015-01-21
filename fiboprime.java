import java.util.Scanner;
public class fiboprime
{
 public static void main(String[] args)
 { 
  int n,i,c,a,b;
  boolean res;
  Scanner obj=new Scanner(System.in);
  System.out.print("Enter the final range : ");
  n=obj.nextInt();
  System.out.println();
  a=c=0;
  b=1;
  res=true;
  System.out.println(a+"\n"+b);
  for(i=2;i<=n;i++)
  {
   c=a+b;
   a=b;
   b=c;
   if(c>1)
   {
   res=isprime(c);
   if(res==true)
   System.out.println(c+"-------->prime");
   else
   System.out.println(c);
   }
   else
   System.out.println(c);
  }
 }
 public static boolean isprime(int a)
 {
  int n,i,r,flag;
  n=a;
  flag=0;
  for(i=2;i<n;i++)
  {
   flag=0;
   r=n%i;
   if(r==0)
   {
    flag=1;
    break;
   }
  }
  if(flag==0)
   return true;
  else
   return false;
 }
}