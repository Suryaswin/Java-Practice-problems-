package Control_Structures;
import java.util.Scanner;

public class GradesGenerator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student ");
        String name = scan.nextLine();
        System.out.println("Enter the marks of the student for a total of 100");
        int marks = scan.nextInt();
        String Grade;
        if(marks>=91 && marks<=100)
        {
            Grade = "A+";
            System.out.println(name + " got a grade of "+ Grade);
        }
        else if(marks>=81 && marks<=90)
        {
            Grade = "A";
            System.out.println(name + " got a grade of "+ Grade);
        }
        else if(marks>=71 && marks<=80)
        {
            Grade = "B";
            System.out.println(name + " got a grade of "+ Grade);
        }
        else if(marks>=61 && marks<=70)
        {
            Grade = "C";
            System.out.println(name + " got a grade of "+ Grade);
        }
        else if(marks>=51 && marks<=60)
        {
            Grade = "D";
            System.out.println(name + " got a grade of "+ Grade);
        }
        else if(marks>=31 && marks<=50)
        {
            Grade = "E";
            System.out.println(name + " got a grade of "+ Grade);
        }
        else if(marks>=0 && marks<=30)
        {
            Grade = "Fail";
            System.out.println(name + " got a grade of "+ Grade);
        }
        else
        {
            System.out.println("Enter the appropriate marks which is between 1 to 100 ");
        }
        scan.close();
    }   
}
