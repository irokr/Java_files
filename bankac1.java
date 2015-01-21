import java.util.Scanner;
public class bankac1
{
 public static void initval()
 {
  String name="";
  long acnum=0L;
  double bal,d,w;
  int ch;

  Scanner obj=new Scanner(System.in);
 
  System.out.print("Name : ");
  name=obj.nextLine();
  System.out.print("\nA/C No. : ");
  acnum=obj.nextLong();
  System.out.print("\nBalance Amount : ");
  bal=obj.nextDouble();
  System.out.print("\n\n1. Deposit\n2. Withdrawl\n3. Display\n\nEnter your choice : ");
  ch=obj.nextInt();
  switch(ch)
  {
   case 1:
    d=dep(bal);
    System.out.println("\nAmount Deposited Successfully.\n\nAvailable Balance : "+d);
   break;
   case 2:
    w=wthdrw(bal);
    if(w==0.0)
     System.out.println("\nWithdrawl Failed due to Insufficient Balance");
    else
     System.out.println("\nWithdrawl Successful.\n\nAvailable Balance : "+w);
   break;
   case 3: 
    disp(name,bal);
   break;
   default:
    System.out.println("Invalid Choice");
   break;
  }
 }

 public static double dep(double a)
 {
  double amt,tot,bal;
  bal=a;
  tot=0.0;
  Scanner obj=new Scanner(System.in);
  System.out.print("\n\nEnter the amount : ");
  amt=obj.nextDouble();
  tot=bal+amt;
  return (tot);
 }

 public static double wthdrw(double b)
 { 
   double amt,tot,bal;
   bal=b;
   tot=0.0;
   Scanner obj=new Scanner(System.in);
   System.out.print("\n\nEnter the amount : ");
   amt=obj.nextDouble();
   if(bal>amt) 
    tot=bal-amt;
   return(tot);
 }

 public static void disp(String a, double b)
 {
  String name=a;
  double bal=b;
  System.out.println("\nName : "+name);
  System.out.println("\nBalance : "+bal+"\n\n");
 }

 public static void main(String[] args)
 {
  initval();
 }
}