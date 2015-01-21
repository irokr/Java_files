import java.util.Scanner;
public class test1 extends calc
{ 
  public static void main(String[] args)
  {
    int ch,c,inpp,n1,n2;
    int[] x=new int[2];
    char ans='y';
    c=0;
    Scanner obj=new Scanner(System.in);
    calc cobj=new calc();
    inpp(x);
    n1=x[0];
    n2=x[1];
    System.out.print(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n\n Enter your choice : ");
    ch=obj.nextInt();
    switch(ch)
    {
     case 1:
      c=1;
      cobj.disp(n1,n2,c); 
    }
  }
}