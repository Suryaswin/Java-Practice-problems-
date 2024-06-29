package Control_Structures;
import java.util.Scanner;

public class MaxCheck
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number value ");
        int a = scan.nextInt();
        System.out.println("Enter the Second number value ");
        int b = scan.nextInt();
        System.out.println("Enter the Third number value ");
        int c = scan.nextInt();
        System.out.println(" ");

        if(a>b && a>c)
        {
            System.out.println(a+" is the Largest number out of the three");
        }
        else if(b>c)
        {
            System.out.println(b+" is the Largest number out of the three");
        }
        else
        {
            System.out.println(c+" is the Largest number out of the three");
        }
        scan.close();
    }
    
}
