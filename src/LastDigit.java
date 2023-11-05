import java.util.Scanner;

//Read a number from keyboard and print its last digit (eg. for 245 result should be 5)
public class LastDigit {
    public static void main(String[] args) {
        while (true) {
            Scanner keyLogger = new Scanner(System.in);
            System.out.print("Please input a value: ");
            int n = keyLogger.nextInt();
            System.out.println("The last digit from the N number is : " + n % 10);
            System.out.println(" ");
        }
    }
}
