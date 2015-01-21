import java.util.Scanner;
public class wordcount
{
 public static void main(String[] args)
 {
   String s,s1="",s2="",s3="",s4="",s5="",s6="";
   int i,len,l1,pos,pk,p,l2,l3,c,l4,l5,l6;
   char ch;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter a sentence :");
   s=obj.nextLine();
   len=s.length();

   pos=l1=pk=l2=p=l3=c=0;
   
   for(i=len-1;i>=0;i--) 					//for finding the position of the last space in the sentence
   {
    ch=s.charAt(i);
    if(ch==' ')
    {
     pk=i;
     break;
    }
   }
   
   for(i=0;i<len;i++)						//for the largest word
   {
    s1="";
    l1=0;
    ch=s.charAt(i);
    
    if(ch==' ')
    {
     if(c==0)
     {
      s3=s.substring(0,i);
      l3=s3.length();
      pos=i+1; 
      c+=1;
     }
     else
     {
     s1=s.substring(pos,i);
     l1=s1.length();
     pos=i+1;
     c+=1;
     }
    }

    if(i==pk)
    { 
     p=i+1;
     s2=s.substring(p,len);
     l2=s2.length();
    }
    
    if(l1!=0 && l1>l3)
    {
      l3=l1;
      s3=s1; 
    }

    else if(l2!=0 && l2>l3 && l2>l1)
    {
     l3=l2;
     s3=s2;
    }
   }
   
   pos=l4=l5=p=l6=c=0;

   for(i=0;i<len;i++)						//for the smallest word
   {
    s4="";
    l4=0;
    ch=s.charAt(i);
    
    if(ch==' ')
    {
     if(c==0) 						//for the first word of the sentence
     {
      s5=s.substring(0,i);
      l5=s5.length();
      pos=i+1; 
      c+=1;
     }
     else 						//for every word in between
     {
     s4=s.substring(pos,i);
     l4=s4.length();
     pos=i+1;
     c+=1;
     }
    }

    if(i==pk) 						//for the last word of the sentence
    { 
     p=i+1;
     s6=s.substring(p,len);
     l6=s6.length();
    }
    
    if(l4!=0 && l4<l5)
    {
      l5=l4;
      s5=s4; 
    }

    else if(l6!=0 && l6<l5 && l6<l4)
    {
     l5=l6;
     s5=s6;
    }
   }
    count1(l3,s3,l5,s5);
 }


 public static int count1(int a, String b,int c, String d)
 {
  int l=a;
  String ls=b;
  int s=c;
  String ss=d;
  System.out.println("\t\tString \t\tLength");
  System.out.println("Largest :\t"+ls+"\t\t"+l);
  System.out.println("Smallest :\t"+ss+"\t\t"+s);
  return (0);
 }

}