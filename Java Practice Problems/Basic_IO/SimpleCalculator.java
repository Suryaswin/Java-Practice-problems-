package Basic_IO;

import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ****Calculator***** ");
        System.out.println("What operation Do u want to perform\nAddition(1)\nSubstraction(2)\nMultiplication(3)\nDivision(4)\nModOperator(5)\nEnter the respective number based on your requirement: ");
        int Choice = scan.nextInt();
        if(Choice>=1 && Choice<=5)
        {
            System.out.print("Enter the First number: ");
            Double N1 = scan.nextDouble();
            System.out.print("Enter the Second number: ");
            Double N2 = scan.nextDouble();
            switch(Choice)
            {
                case(1):
                System.out.println("The Sum of the given numbers is "+(N1+N2));
                break;
                case(2):
                System.out.println("The Difference of the given numbers is "+(N1-N2));
                break;
                case(3):
                System.out.println("The Product of these given numbers is "+(N1*N2));
                break;
                case(4):
                if(N2!=0)
                {
                    System.out.println("The Division of the given numbers is "+(N1/N2));
                }
                else if(N2 == 0)
                {
                    System.out.println("The denominator Shouldn't be a 0");
                }
                break;
                case(5):
                if(N2!=0)
                {
                    System.out.println("The Remainder of the given numbers if divided is "+(N1%N2));
                }
                else if(N2 == 0)
                {
                    System.out.println("The denominator Shouldn't be a 0");
                }
                break;
            }
            System.out.println("Calculation Terminated");
        }
        else
        {
            System.out.println("Entered the wrong value");
        }
        scan.close();
    }
    
}
