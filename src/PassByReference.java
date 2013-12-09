
public class PassByReference {

	public static void main(String [] args) {
		String [][] matrix = new String [4][4];
		matrix = fillMatrix(matrix);
		printMatrix(matrix);
		nilMatrix(matrix);
		printMatrix(matrix);
	}
	
	public static void nilMatrix(String [][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = "n";
			}
		}
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
