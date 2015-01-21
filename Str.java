class Str
{
public static void main(String []ar)
{
String a;
int len;
String str1;
a="gourab kumar paul";
len=a.length();
System.out.println(len);
len--;
while(len>=0)
{
if(a.charAt(len)==' ')
break;
len--;
}
str1=a.substring(len+1);
//a=a+" "+"paul";
System.out.println(str1);
}
}