package Control_Structures;
import java.util.Scanner;

public class EvenOrOddCheck
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        if(number%2 == 0)
        {
            System.out.println(number+" is even number");
        }
        else
        {
            System.out.println(number+" is odd number");
        }
        scan.close();
    }
}
