package Control_Structures;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();
        int HCF = 0;  // Initialize HCF with a default value
        System.out.println();

        if (num1 == 0 && num2 == 0)
        {
            HCF = 0;
        } 
        else if (num1 == 0)
        {
            HCF = num2;
        } 
        else if (num2 == 0)
        {
            HCF = num1;
        } 
        else if(num1>num2)
        {
            int a = num1;
            int b = num2;
            while (b != 0)
            {
                int temp = b;
                b = a % b;
                a = temp;
            }
            HCF = a;
        }
        else if(num1<num2)
        {
            int b = num1;
            int a = num2;
            while (b != 0)
            {
                int temp = b;
                b = a % b;
                a = temp;
            }
            HCF = a;
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + HCF);
        scan.close();
    }
}
