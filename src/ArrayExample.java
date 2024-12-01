import java.util.Arrays;

public class ArrayExample {
    // Java has static arrays => can't resize
    public static void main(String[] args) {
        // Initialize an array of size 5
        int[] res = new int[5];
        res[0] = 1;
        res[1] = 2;

        // Print the array's memory address
        System.out.println(res);

        // Convert the array to a string representation and print it
        String array = Arrays.toString(res);
        System.out.println(array);

        // Use modern way to initialize arrays
        int[] nums = {2, 3, 4, 5, 1};
        System.out.println(nums.length);
        System.out.println("Unsorted array: " + Arrays.toString(nums));

        // Sort the array
        Arrays.sort(nums);
        System.out.println("Sorted array:   " + Arrays.toString(nums));
    }
}