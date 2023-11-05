import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        while (true) {
            Scanner keyLogger = new Scanner(System.in);
            System.out.print("Please input a value: ");
            int n = keyLogger.nextInt();
            while (n > 9) {
                n = n / 10;
            }
            System.out.println("The first digit of the value N is: " + n);
        }
    }
}
