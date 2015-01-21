import java.util.Scanner;
public class stringalpha
{ 
 public static void main(String[] args)
 {
   String s;
   int i,len,j,tmp;
   char ch;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter a string : ");
   s=obj.nextLine();
   len=s.length();
   tmp=0;
   int[] size=new int[len];
   for(i=0;i<len;i++)
   { 
     ch=s.charAt(i);
     size[i]=(int)ch;
   }
   for(i=1;i<len;i++)
   {
    for(j=0;j<(len-i);j++)
    {
     if(size[j]>size[j+1])
     { 
      tmp=size[j];
      size[j]=size[j+1];
      size[j+1]=tmp;
     }
    }
   }
    for(i=0;i<len;i++)
    {
     ch=(char)size[i];
     System.out.println(ch);
     }
    
 }
}