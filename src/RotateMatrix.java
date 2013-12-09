
public class RotateMatrix {

	public static void main(String [] args) {
		String [][] matrix = new String [4][4];
		matrix = fillMatrix(matrix);
		printMatrix(matrix);
		printMatrix(rotateMatrix(matrix));
	}
	
	public static String[][] rotateMatrix(String [][] matrix) {
		
		if (matrix.length <= 1) {
			return matrix;
		}
		if (matrix.length != matrix[0].length) {
			return matrix;
		}
		
		String [][] rotatedMatrix = new String[matrix.length][matrix.length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				//left
				//rotatedMatrix[i][j] = matrix[j][matrix.length - 1 - i];
				//right
				rotatedMatrix[i][j] = matrix[matrix.length -1 - j][i];
			}
		}
		
		return rotatedMatrix;
	}
	
	public static String[][] fillMatrix(String [][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = i + "" + j;
			}
		}
		return matrix;
	}
	
	public static void printMatrix(String [][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
