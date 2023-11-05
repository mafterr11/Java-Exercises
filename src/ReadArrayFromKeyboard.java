import java.util.Scanner;
//Read a number n from keyboard that represents an array length. Then, read n elements and store them in a Java array.
public class ReadArrayFromKeyboard {
    public static void main(String[] args) {
        Scanner keyLogger = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = keyLogger.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements, one at a time:");
        for (int i = 0; i < n; i++) {
            array[i] = keyLogger.nextInt();
        }

        keyLogger.close();

        System.out.println("Elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
            System.out.println(" ");
        }
    }
}





