package Control_Structures;
import java.util.Scanner;

public class VoweOrConsoCheck
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the alphabet you want to check whether it's a vowel or consonant:");
        String input = scan.nextLine();
        char letter = input.charAt(0);
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered alphabet is a Vowel");
                break;
            default:
                System.out.println("Entered alphabet is a Consonant");
        }
        scan.close();
    }
}
