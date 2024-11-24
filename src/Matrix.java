
import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		// Creating a 5x5 square matrix
		int[][] matrix = new int[5][5];

		// Set the top-left corner to 1
		matrix[0][0] = 1;
		System.out.println(Arrays.deepToString(matrix));

		// Creating a 3D array
		int[][][] threeDMatrix = new int[6][6][6];
		threeDMatrix[0][0][0] = 5;
		System.out.println(Arrays.deepToString(threeDMatrix));

		// Using the curly braces syntax for predefined matrices
		int [][] numbers = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(Arrays.deepToString(numbers));
	}
}
