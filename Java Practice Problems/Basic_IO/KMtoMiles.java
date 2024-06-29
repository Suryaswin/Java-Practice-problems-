package Basic_IO;
import java.util.Scanner;

public class KMtoMiles
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of Kilometers: ");
        Double km = scan.nextDouble();
        Double InMiles = km/1.609344;
        System.out.print("The convertion is completed value of "+km+"km in miles is "+InMiles);
        scan.close();
    }
    
}
