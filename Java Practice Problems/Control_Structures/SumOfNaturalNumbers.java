package Control_Structures;

import java.util.Scanner;

public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth natural number untill which u want to find the sum");
        double n = scan.nextDouble();
        double sum = (n*(n+1))/2;
        System.out.println("The sum of natural numbers starting from 0 to "+n+" is "+sum);
        scan.close();
    }
    
}
