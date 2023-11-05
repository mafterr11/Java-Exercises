import java.util.Scanner;

//Read a number from keyboard and print 'n is even' if the number is even, or 'n is odd' otherwise
public class EvenNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner keyboardScanner = new Scanner(System.in);
            System.out.print("Please input a number: ");
            int a = keyboardScanner.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " is an even number");
            } else {
                System.out.println(a + " is an odd number");
            }
            System.out.println(" ");

        }
    }
}
