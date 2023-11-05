import java.util.Scanner;

//Input a number n from keyboard and add up the numbers from 0 to n.
public class SumOfNumbers {
    public static void main(String[] args) {
        while (true) {
            Scanner keyLogger = new Scanner(System.in);
            System.out.print("Please enter a number:");
            int n = keyLogger.nextInt();
            keyLogger.close();
            int sum = 0;

            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            System.out.println("The result is: " + sum);
            System.out.println(" ");
        }
    }
}
