package Basic_IO;
import java.util.Scanner;

public class DivisibilityCheck
{
    public static void main(String[] args)
    {
        System.out.println("TO CHECK THE DIVISIBILITY BETWEEN TWO NUMBERS\nYOU HAVE TO SUBMIT THOSE NUMBERS AND CHECK WHICH NUMBER YOU WANT TO CHECK");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int N1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        int N2 = scan.nextInt();
        System.out.println("Enter the number you required to check the divisibility between these two numbers above mentioned : ");
        int Num = scan.nextInt();
        Boolean check =((Num>=N1 && Num>=N2)&&(((Num % N1 ) ==0 ) && (Num % N2 == 0)));
        if(check)
        {
            System.out.println("The entered number satisfies the divisibility check for the given numbers");
        }
        else
        {
            System.out.println("The entered number doesn't obey divisibility either the checking number is less than the taken numbers or its not divisible in both the numbers taken");
        }
        scan.close();

    }

}
