import java.util.Arrays;
import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random random = new Random();
        int[] originalArray = new int[10];
        for (int i = 0; i < 10; i++) {
            originalArray[i] = random.nextInt(20) - 10;
        }
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        int[] evenArray = Arrays.stream(originalArray).filter(num -> num % 2 == 0).toArray();
        System.out.println("Even Array: " + Arrays.toString(evenArray));

        int[] oddArray = Arrays.stream(originalArray).filter(num -> num % 2 != 0).toArray();
        System.out.println("Odd Array: " + Arrays.toString(oddArray));

        int[] negativeArray = Arrays.stream(originalArray).filter(num -> num < 0 ).toArray();
        System.out.println("Negative Array: " + Arrays.toString(negativeArray));

        int[] positiveArray = Arrays.stream(originalArray).filter(num -> num > 0).toArray();
        System.out.println("Positive Array: " + Arrays.toString(positiveArray));

    }
}
