package javautilArrays;

// Sort an array and print it with the Arrays utility class.
import java.util.Arrays;

public class ArraysSortPrint {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 3};
        Arrays.sort(a);
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}
