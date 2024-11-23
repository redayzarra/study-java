
import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		// Creating a 5x5 square matrix
		int[][] matrix = new int[5][5];

		// Set the top-left corner to 1
		matrix[0][0] = 1;
		System.out.println(Arrays.deepToString(matrix));
	}
}
