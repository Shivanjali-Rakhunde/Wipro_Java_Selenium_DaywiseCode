import java.util.Arrays;

public class CopyArrayExample {

    public static void main(String[] args) {

        // Original array
        int[] original = {10, 20, 30, 40, 50};

        // Copy first 3 elements from original array
        int[] copy = Arrays.copyOf(original, 3);

        // Print copied array
        System.out.println("Copied Array: " + Arrays.toString(copy));
    }
}

