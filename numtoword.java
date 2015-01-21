import java.util.Scanner;
public class numtoword
{
 public static void main(String[] args)
 {
  int n;
  String s="";
  Scanner obj=new Scanner(System.in);
  System.out.print("Enter a number (1 to 9999) : ");
  n=obj.nextInt();
  s=inword(n);
  System.out.print("\n"+s+"\n");
 }


 public static String inword(int a)
 {
  int n,len,t,s,r,c;
  String s1="",s2="",s3="",s4="";
  n=a;
  t=n;
  len=0;
  s=0;
  while(t!=0)
  {
   r=t%10;
   s=(s*10)+r;
   len+=1;
   t=t/10;
  }
  t=s;
  c=len-1;
  if(len>4)
  s2="Out of Range (Range: 1 to 9999)";
  else if(len==4)
  {
   while(t!=0)
   {
    r=t%10;
    s3=inword3(c,r);
    s1=inword2(r);
    if(c==1)
    s4=s3;
    else
    s4=s1+" "+s3;
    s2=s2+" "+s4;
    t=t/10;
    c=c-1;
   }
  }
  else if(len==3)
  {
   while(t!=0)
   {
    r=t%10;
    s3=inword3(c,r);
    s1=inword2(r);
    if(c==1)
    s4=s3;
    else
    s4=s1+" "+s3;
    s2=s2+" "+s4;
    t=t/10;
    c=c-1;
   }
  }
  else if(len==2)
  {
   while(t!=0)
   {
    r=t%10;
    s3=inword3(c,r);
    s1=inword2(r);
    if(c==1)
    s4=s3;
    else
    s4=s1+" "+s3;
    s2=s2+" "+s4;
    t=t/10;
    c=c-1;
   }
  }
  else if(len==1)
  {
   while(t!=0)
   {
    r=t%10;
    s2=inword2(r);
    t=t/10;
   }
  }
  return(s2);
 }


 public static String inword2(int a)
 {
  int n=a;
  String s1="";
  if(n==0)
   s1="";
  else if(n==1)
   s1="One";
  else if(n==2)
   s1="Two";
  else if(n==3)
   s1="Three";
  else if(n==4)
   s1="Four";
  else if(n==5)
   s1="Five";
  else if(n==6)
   s1="Six";
  else if(n==7)
   s1="Seven";
  else if(n==8)
   s1="Eight";
  else
   s1="Nine";
  
  return (s1);
 }

 public static String inword3(int a, int b)
 {
  int n=a;
  int r=b;
  String s="";
  if(n==3)
   s="Thousand";
  else if(n==2)
   {
     if(r==0)
      s="";
     else
      s="Hundred";
   }
  else if(n==1)
   {
    if(r==0)
     s="And";
    else if(r==1)
     s="Ten";
    else if(r==2)
     s="Twenty";
    else if(r==3)
     s="Thirty";
    else if(r==4)
     s="Fourty";
    else if(r==5)
     s="Fifty";
    else if(r==6)
     s="Sixty";
    else if(r==7)
     s="Seventy";
    else if(r==8)
     s="Eighty";
    else
     s="Ninety";
   }
   return(s);
 }
}