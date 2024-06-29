package Basic_IO;
import java.util.Scanner;

public class BMIcalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of Weight of the Person: ");
        Double Weight = scan.nextDouble();
        System.out.print("Enter the Height of the person: ");
        Double Height = scan.nextDouble();
        Double BMI = Weight/(Height*Height);
        System.out.print("The Body Mass Index according to the given persons Height and Weight is: "+BMI+" Kilogram per meter square");
        scan.close();
    }
    
}
