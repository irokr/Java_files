import java.util.Scanner;
public class series1
{
 public static void main(String[] args)
 {
  int i,n,p,m,c,r,ch,s;
  long k,k1;
  Scanner obj=new Scanner(System.in);
  System.out.print("Enter a digit : ");
  n=obj.nextInt();
  System.out.print("\n1. Series 1\n2. Series 2\n3. Series 3\n4. Series 4\n\n Enter your choice : ");
  ch=obj.nextInt();
  switch(ch)
  {
    case 1:
     p=c=r=0;
     for(i=1;i<=9;i++)
     {
      r=(r*10)+i;
      m=r*n;
      c=m+i;
      System.out.print("\n"+r+" * "+n+" + "+i+" = "+c);
     }
    break;
    case 2:
     p=c=r=s=0;
     for(i=1;i<=9;i++)
     {
      r=(r*10)+i;
      m=r*n;
      s=i+1;
      c=m+s;
      System.out.print("\n"+r+" * "+n+" + "+s+" = "+c);
     }
    break;
    case 3:
     p=c=r=0;
     s=8;
     for(i=9;i>1;i--)
     {
      r=(r*10)+i;
      m=r*n;
      s=s-1;
      c=m+s;
      System.out.print("\n"+r+" * "+n+" + "+s+" = "+c);
     }
    break;
    case 4:
     r=0;
     for(i=1;i<=9;i++)
     {
      r=(r*10)+1;
      k1=(long)r;
      k=k1*k1;
      System.out.print("\n"+r+" * "+r+" = "+k);
     }
    break;
     default:
      System.out.println("\t\t Invalid Choice");
     break;
    }
     
 }
}