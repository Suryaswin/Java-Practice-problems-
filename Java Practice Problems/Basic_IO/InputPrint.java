package Basic_IO;
import java.util.Scanner;
public class InputPrint
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = scan.nextLine();
        System.out.print("Enter the Surname : ");
        String Surname = scan.nextLine();
        System.out.print("So ur name is "+name+" "+Surname);
        scan.close();
    }
    }
