package Control_Structures;
import java.util.Scanner;

public class PosiNegaZeroCheck
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = scan.nextInt();
        if(num>0)
        {
            System.out.println(num +" is a positive number ");
        }
        else if(num<0)
        {
            System.out.println(num +" is a negative number ");
        }
        else
        {
            System.out.println(num +" is neither a positive number nor a negative number ");
        }
        scan.close();
    }   
}
