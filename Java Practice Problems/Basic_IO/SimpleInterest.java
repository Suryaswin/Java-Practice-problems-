package Basic_IO;
import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        Double principal = scan.nextDouble();
        System.out.println("Enter the Rate of interest: ");
        Double rateOfInterest = scan.nextDouble();
        System.out.println("Enter the Duration period: ");
        Double Duration = scan.nextDouble();
        Double SimpInterest = (principal*rateOfInterest*Duration)/100;
        Double SimpInterestPercent = (SimpInterest/principal)*100;
        System.out.print("The Simple Interest of the given attributes is : "+ SimpInterest+" whose percentage is "+SimpInterestPercent+"%");
        scan.close();

    }
    
}
