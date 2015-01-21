import java.util.Scanner;
public class nameinit
{
    public static void main(String[] args)
    {
        String s,s1;
        int i,p,pos,j,k,len;
        char ch,mh,kh;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a name : ");
        s=obj.nextLine();
        len=s.length();
        p=pos=0;
        s1="";
        mh='\u0000';
        kh='\u0000';
        for(i=len-1;i>=0;i--)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                p=i;
                pos=i+1;
                s1=s.substring(pos);
                break;
            }
        }
        for(j=0;j<p;j++)
        {
            ch=s.charAt(j);
            if(j==0)
            mh=ch;
            if(ch==' ')
            {
                pos=j+1;
                kh=s.charAt(pos);
                break;
            }
        }
            if(kh=='\u0000')
            s1=s1+" "+mh+".";
            else
            s1=s1+" "+mh+". "+kh+". ";
            System.out.print(s1);
    }
}
