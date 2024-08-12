package surajapplication;
import java.util.Scanner;

public class MatrixOperations {
	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		int rows = matrix1.length;
		int cols = matrix1[0].length;
		int[][] reslut = new int[rows][cols];
		int[][] result = null;
		for (int i=0;i< rows;i++) {
			for (int j=0;j<cols;j++) {
				result[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		return result;
	}
	public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
		int rows=matrix1.length;
		int cols = matrix1[0].length;
		int[][] result= new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0; j<cols;j++) {
				result[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		return result;
	}

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int cols2 = matrix2[0].length;
		int[][] result = new int[rows1][cols2];
		for (int i=0;i<rows1;i++) {
			for(int j=0;j<cols2; j++) {
				for(int k=0;k<cols1;k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.print("enter the number of rows for the matrices:");
int rows = scanner.nextInt();
System.out.print("enter the number of cols for the matrices:");
int cols = scanner.nextInt();
int[][] matrix1 = new int[rows][cols];
int[][] matrix2 = new int[rows][cols];
System.out.println("enter elements of the first matrix:");
for (int i=0;i<rows;i++) {
	for(int j=0;j<cols;j++) {
		matrix1[i][j]= scanner.nextInt();
		
	}
}
System.out.println("enter elements of the second matrix:");
for(int i=0; i< rows;i++) {
	for(int j=0;j<cols;j++) {
		matrix2[i][j] = scanner.nextInt();
	}
}

int[][] sum = addMatrices(matrix1,matrix2);
System.out.println("sum of the matrices:");
printMatrix(sum);
int[][] difference = subtractMatrices(matrix1,matrix2);
System.out.println("differnce of the matrices:");
printMatrix(difference);

if (matrix1[0].length == matrix2.length) {
	int[][] product = multiplyMatrices(matrix1,matrix2);
	System.out.println("product of the matrices:");
	printMatrix(product);
	
}else {
	System.out.println("matrix multiplication is not possible with the given matrices.");
}

	}
	public static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
