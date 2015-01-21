import java.util.Scanner;
public class strfreq
{
  public static void main(String[] args)
  {
      String s,ws,s1;
      int i,len,c,p,pos;
      char ch;
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter a sentence : ");
      s=obj.nextLine();
      len=s.length();
      c=0;
      s1="";
      //p=0;
      pos=0;
      System.out.print("Enter a word to be searched : ");
      ws=obj.nextLine();
      
      for(i=0;i<len;i++)
      {
          
          
          pos=0;
          s1="";
          ch=s.charAt(i);
          if(ch==' ')
          {
          
          pos=i+1;
          s1=s.substring(0,i);
          s=s.substring(pos);
         // System.out.print(s1+" ");
         // System.out.print("\n"+s+" ");
          }
          if(s1.equalsIgnoreCase(ws))
          c+=1;
          if(s=="")
          break;
          
      }

      
      System.out.println(c);
  }
  
}
