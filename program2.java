import java.util.Scanner;
public class program2 extends toys1
{
 public static void main(String[] args)
 {
     int ch;
     Scanner in=new Scanner(System.in);
     toys1 robot=new toys1();
     toys1 car=new toys1();
     toys1 lego=new toys1();
     toys1 doll=new toys1();
     System.out.print("1. Robot\n2. Car\n3. Lego\n4. Doll\n\n Enter your choice : ");
     ch=in.nextInt();
     switch(ch)
     {
         case 1:
          System.out.println("\n\n\n\\n\t\t Robot");
          
          robot.disp();
         break;
         case 2:
          System.out.println("\n\n\n\\n\t\t Car");
          
          car.disp();
         break;
         case 3:
          System.out.println("\n\n\n\\n\t\t Lego");
          
          lego.disp();
         break;
         case 4:
          System.out.println("\n\n\n\\n\t\t Doll");
          
          doll.disp();
         break;
         default:
          System.out.println("\n\nInvalid Choice");
         break;
     }
 }
}
