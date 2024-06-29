package Basic_IO;
import java.util.Scanner;

public class PerfectSquare
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number which you want to check whether its perfect sqaure or not: ");
        int number = scan.nextInt();
        int sqrt = (int)Math.sqrt(number);
        Boolean check = (sqrt*sqrt) == number;
        if(check)
        {
            System.out.println(number+" is a perfect square");
        }
        else
        {
            System.out.println(number+" is a not a perfect square");
        }
        scan.close();
    }
    
}
