import java.util.Scanner;

//Read 2 numbers from keyboard and print their sum.
public class SumOfTwo {
    public static void main(String[] args) {
        while (true) {
            Scanner keyLogger = new Scanner(System.in);

            System.out.print("Please type in the first number: ");
            int firstNumber = keyLogger.nextInt();

            System.out.print("Please type in the second number: ");
            int secondNumber = keyLogger.nextInt();
            keyLogger.close();
            System.out.println("The sum is equal to: " + (firstNumber + secondNumber));
            System.out.println(" ");
        }
    }
}
