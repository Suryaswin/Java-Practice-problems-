package Control_Structures;

import java.util.Scanner;

public class SumOfFirstnEvenNumbers
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first no.of numbers until which we want to check sum of evens");
        int number = scan.nextInt();
        int sum = 0;
        for(int i = 0;i<=number;i+=2)
        {
            sum = sum+i;
        }
        System.out.println("Therefore the total sum of even numbers in between 0 to "+number+" is "+sum);
        scan.close();
    }
}
