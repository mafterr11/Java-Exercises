import java.util.Scanner;

//Read a number from keyboard and print its factorial.
public class Factorial {
    public static void main(String[] args) {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = reader.nextInt();
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The result is: " + factorial);
            System.out.println(" ");
        }
    }
}
