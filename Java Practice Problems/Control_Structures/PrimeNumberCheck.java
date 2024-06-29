package Control_Structures;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check whether it's prime or not:");
        int number = scan.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
        scan.close();
    }
}
