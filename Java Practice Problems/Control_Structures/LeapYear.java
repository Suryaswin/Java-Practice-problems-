package Control_Structures;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year which u want to check whether it is leap year or not: ");
        int year = scan.nextInt();
        if((year%400 == 0) || ((year%4 == 0) && (year%100 != 0)))
        {
            System.out.println("It is a Leap year it contains a total of 366 days");
        }
        else
        {
            System.out.println("It is not a Leap year it contains a total of 365 days");
        }
        scan.close();
    }
}