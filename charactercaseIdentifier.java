package JavaWeek5Tut;

import java.util.Scanner;
public class charactercaseIdentifier {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.print("Enter an Character: ");
        char character = letter.next().charAt(0);
        if (character >= 'A' && character <= 'Z')
        {
            System.out.println(character + " is a Upper Case Letter");
        }
        else if (character >= 'a' && character <= 'z')
        {
            System.out.println(character + " is a Lower Case Letter");
        }
        else{
            System.out.println(character + " is not a Upper Case or a Lower Case Letter");
        }
    }
}
