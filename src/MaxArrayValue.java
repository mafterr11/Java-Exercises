//Given an array of numbers, find the min value from the array and print it.
public class MaxArrayValue {
    public static void main(String[] args) {
        int[] array = {150, 12, 22, -6, 0, -44, -29, 16};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                //(array[i] > max) to find the max value of the array
                min = array[i];
            }

        }
        System.out.println(min);
    }
}
