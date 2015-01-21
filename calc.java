import java.util.Scanner;
public class calc
{
 public void inpp(int n[])
 {
   
   int i;
   Scanner obj=new Scanner(System.in);
   for(i=0;i<2;i++)
   {
   System.out.print("Enter value"+(i+1)+" : ");
   n[i]=obj.nextInt();
   }
   
 }
   public int calcu(int a, int b, int c)
   {
    int n1,n2,ch,res;
    n1=a;
    n2=b;
    ch=c;
    res=0;
    switch(ch)
    {
     case 1:
      res=n1+n2;
     break;
     case 2:
      if(n1>=n2)
       res=n1-n2;
      else
       res=n2-n1;
     break;
     case 3:
      res=n1*n2;
     break;
     case 4:
      res=n1/n2;
     break;
     default:
     break;
    }
     return(res);
   }
  
   public void disp(int a, int b, int c)
   {
    int n1,n2,ch;
    n1=a;
    n2=b;
    ch=c;
    int res=calcu(n1,n2,c);
    System.out.println(res);
   }
}