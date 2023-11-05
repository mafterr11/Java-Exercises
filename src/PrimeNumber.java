import java.util.Scanner;

//Read a number from keyboard and print 'n is a prime' if the number is prime and 'n is not a prime' otherwise.
public class PrimeNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner keyLogger = new Scanner(System.in);
            System.out.print("Please enter a number n: ");
            int n = keyLogger.nextInt();
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("N is a prime number");
            } else System.out.println("N is not a prime number");
            System.out.println(" ");
        }
    }
}
