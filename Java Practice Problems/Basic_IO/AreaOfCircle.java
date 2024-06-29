package Basic_IO;
import java.util.Scanner;

public class AreaOfCircle 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of radius of the circle: ");
        Double radius = scan.nextDouble();
        Double Area = (3.14159265359)*(radius*radius);
        System.out.print("Area of the circle which has radius of "+radius+" is "+Area);
        scan.close();
    }
    
}
