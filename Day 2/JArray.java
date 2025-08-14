import java.util.Arrays;

public class JArray {
    public static void main(String[] args) {

        // Declaration and initialization of an integer array
        int[] numbers = new int[5];

        // Assign values
        numbers[0] = 444;
        numbers[1] = 4344;
        numbers[2] = 4464;
        numbers[3] = 4414;
        numbers[4] = 44554;

        // Iterate elements using simple for loop
        System.out.println("Array using simple for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }

        // Iterate elements using enhanced for loop
        System.out.println("\nArray using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Declare and initialize an array in one step
        int[] nums = {2554, 5467, 77, 87, 8, 86, 6, 67, 6, 7};
        System.out.println("\nOriginal nums array:");
        for (int n : nums) {
            System.out.print(n + ", ");
        }
        System.out.println();

        // Sort the array
        Arrays.sort(nums);
        System.out.println("Sorted nums array: " + Arrays.toString(nums));

        // Binary search in sorted array
        int[] arr = {1, 2, 5, 9};
        int index = Arrays.binarySearch(arr, 2);
        System.out.println("\nThe element 2 is at index: " + index);

        // Fill an array with a value
        int[] arr1 = new int[5];
        Arrays.fill(arr1, 6);
        System.out.println("Array after fill: " + Arrays.toString(arr1));

        // Compare arrays
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        boolean result = Arrays.equals(a, b);
        System.out.println("\nArrays a and b are equal: " + result);

        // Copy array
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        // Parallel sort
        int[] psarr = {5, 2, 1, 9};
        Arrays.parallelSort(psarr);
        System.out.println("Parallel sorted array: " + Arrays.toString(psarr));

        // Multi-dimensional array
        int[][] darr = {
            {1, 2, 3, 4, 6},
            {2, 5, 8, 9, 3},
            {2, 6, 7, 8, 5},
            {8, 9, 0, 4, 1}
        };

        System.out.println("\nMulti-dimensional array contents:");
        for (int row = 0; row < darr.length; row++) {
            for (int col = 0; col < darr[row].length; col++) {
                System.out.println("darr[" + row + "][" + col + "]: " + darr[row][col]);
            }
        }

        // Deep equality for 2D arrays
        int[][] a1 = {{1, 2}, {3, 4}};
        int[][] b1 = {{1, 2}, {3, 4}};
        System.out.println("\nDeep equals for 2D arrays: " + Arrays.deepEquals(a1, b1));
    }
}
