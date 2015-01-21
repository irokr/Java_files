import java.util.Scanner;
import java.lang.*;
public class bintodec
{
 public static void main(String[] args)
 {
     
     int i,c,s,n,r,j,m;
     int res=0;
     Scanner obj=new Scanner(System.in);
     System.out.print("Enter a binary value : ");
     n=obj.nextInt();
     c=0;
     j=2;
     while(n!=0)
     {
         r=n%10;
         if(r==1 || r==0)
         {
             m=(int)Math.pow(j,c);
             s=r*m;
             res=res+s;
             c+=1;
             n=n/10;
         }
         else
         {
             System.out.println("Invalid Binary Number");
             break;
         }
    }
     System.out.println("Equvalent Decimal value : "+res);
 }
}
