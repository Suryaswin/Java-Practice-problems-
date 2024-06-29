package Basic_IO;
import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        Double Principal = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        Double rateOfInterest = scan.nextDouble();
        System.out.print("Enter the number of times the interest is compunded in an year: ");
        Double Ntimes = scan.nextDouble();
        System.out.print("Enter the number of years the amount is being saved: ");
        Double Years = scan.nextDouble();
        Double TotalAmount =(Principal) * Math.pow(((1+((rateOfInterest/100)/Ntimes))),(Ntimes*Years));
        Double CI = TotalAmount-Principal;
        Double CIpercentage = (CI/Principal)*100;
        System.out.println("the total accumulated amount is : "+TotalAmount);
        System.out.print("The Compound Interest based on the given values is : "+CI+" Whose percentage is :"+CIpercentage);
        scan.close();
    }

    
}