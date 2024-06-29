package Control_Structures;
import java.util.Scanner;
public class SumOfFirstnOddNumbers
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first no. of numbers until which we want to check sum of odds");
        int number = scan.nextInt();
        int sum = 0;
        for(int i = 1;i<=number;i+=2)
        {
            sum = sum+i;
        }
        System.out.println("Therefore the total sum of odd numbers in between 0 to "+number+" is "+sum);
        scan.close();
    } 
}
