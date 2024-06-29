package Control_Structures;
import java.util.Scanner;
public class MultiplicationTables
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number whose mathematical table you want to check: ");
        int N = scan.nextInt();
        int M;
        for(int i=1;i<=20;i++)
        {
            M = N*i;
            System.out.println(N+" x "+i+" = "+M);
        }
        scan.close();
    }
}
