package javautilArrays;

// Use Arrays.copyOf and Arrays.fill to build and change arrays.
import java.util.Arrays;

public class ArraysFillCopy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] first3 = Arrays.copyOf(a, 3);          // keep only the first 3
        int[] big = Arrays.copyOf(a, 7);            // longer -> extra cells become 0
        Arrays.fill(big, 0, 3, 9);                  // set cells 0..2 to 9
        System.out.println("first3: " + Arrays.toString(first3));
        System.out.println("big:    " + Arrays.toString(big));
    }
}
