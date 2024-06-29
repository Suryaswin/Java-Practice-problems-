package Basic_IO;
import java.util.Scanner;

public class CelsiusAndFahrenheit 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value 1 if you want to do convertion of celsius to fahrenheit Or\nEnter the value 2 if you want the convertion of fahrenheit to celsius:");
        int Preference = scan.nextInt();
        if (Preference == 1 || Preference == 2)
        {
            System.out.println("Enter the temperature value you want to convert: ");
            Double Temp = scan.nextDouble();
            if(Preference == 1)
            {
                Double change = (Temp * 9/5) + 32;
                System.out.print("The change of temperature from celsius to fahrenheit is done and its value is: "+change);
            }
            else
            {
                Double change = (Temp - 32) * 5/9;
                System.out.print("The change of temperature from fahrenheit to celsius is done and its value is: "+change);

            }
        }
        else
        {
            System.out.println("Enter the value as either 1 or 2 you entered the wrong number");
        }
        scan.close();
    }
    
}
