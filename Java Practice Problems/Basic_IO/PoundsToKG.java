package Basic_IO;

import java.util.Scanner;

public class PoundsToKG
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of weight in Pounds: ");
        Double Pounds = scan.nextDouble();
        Double InKg = Pounds/2.205;
        System.out.print("The convertion is completed value of "+Pounds+"pounds in kilograms is "+InKg);
        scan.close();
    }
}
