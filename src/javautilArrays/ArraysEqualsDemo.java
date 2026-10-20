package javautilArrays;

// Compare two arrays with the Arrays.equals method.
import java.util.Arrays;

public class ArraysEqualsDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        System.out.println("a equals b: " + Arrays.equals(a, b));
        System.out.println("a equals c: " + Arrays.equals(a, c));
    }
}
