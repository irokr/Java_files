import java.util.Scanner;
public class toys1
{
    public void disp()
    {
        String rate=getrating();
        
        System.out.print("\nRating : "+rate);
    }

    public String getrating()
    {
        double sale,tp,persale;
        String rate="",s="";
        Scanner obj=new Scanner(System.in);
        System.out.print("\nEnter Sales Unit : ");
        sale=obj.nextInt();
        System.out.print("\nEnter Total Produce Unit : ");
        tp=obj.nextInt();
        persale=(sale/tp)*100;
        if(persale>85)
         rate="Very Good";
        else if(persale>65 && persale<=85)
         rate="Good";
        else if(persale>40 && persale<=65)
         rate="Average";
        else
         rate="Poor";
         //disp(rate);
         
         return (rate);
    }
    
    
}

