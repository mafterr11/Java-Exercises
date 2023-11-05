import java.util.Scanner;

//Read a text input and print 'Text is too short!' if its length is under 10 characters,
//'Text is too long!' if its length is over 10 characters and 'That's the one!' if it has exactly 10 characters.
public class StringLength {
    public static void main(String[] args) {
        while (true) {
            Scanner keyLogger = new Scanner(System.in);
            System.out.println("Please input a text line bellow: ");
            String input = keyLogger.nextLine();
            keyLogger.close();

            if (input.length() > 10) {
                System.out.println("Text is too long!");
            } else if (input.length() < 10) {
                System.out.println("Text is too short!");
            } else System.out.println("That's the one!");
            System.out.println(" ");
        }
    }
}
