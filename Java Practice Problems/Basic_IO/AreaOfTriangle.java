package Basic_IO;
import java.util.Scanner;
public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the magnitude of the base of the triangle: ");
        Double base = scan.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        Double height = scan.nextDouble();
    
        Double Area = (base*height)*(0.5);
        System.out.print("Area of the rectangle is "+Area);
        scan.close();
    }
}
