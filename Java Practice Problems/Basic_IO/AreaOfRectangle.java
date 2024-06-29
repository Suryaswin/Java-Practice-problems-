package Basic_IO;

import java.util.Scanner;

public class AreaOfRectangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        Double length = scan.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        Double width = scan.nextDouble();

        Double Area = length*width;
        System.out.print("Area of the rectangle is "+Area);
        scan.close();
    }
    
}
