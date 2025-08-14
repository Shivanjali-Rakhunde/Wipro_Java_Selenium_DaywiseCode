import java.util.Arrays;

public class CopyFullArray {

    public static void main(String[] args) {

        // Original array
        int[] original = {10, 20, 30, 40, 50};

        // Copy the entire array using Arrays.copyOf
        int[] copy = Arrays.copyOf(original, original.length);

        // Print both arrays
        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Copied Array:   " + Arrays.toString(copy));
    }
}

