// Java code to print a given matrix in custom form
import java.io.*;

class TraverseMatrix {

	// Function to traverse and print matrix in spiral form
	static void TraverseMatrixPrint(int endRowsIndex, int endColumnsIndex, int mat[][])
	{
		int iterator, startRowIndex = 0, startColumnIndex = 0;
        //loop to traverse the matrix
		while (startRowIndex < endRowsIndex && startColumnIndex < endColumnsIndex) {
			// Print the first row from the remaining rows
			for (iterator = startColumnIndex; iterator < endColumnsIndex; ++iterator) {
				System.out.print(mat[startRowIndex][iterator] + " ");
			}
			startRowIndex++;

			// Print the last column from the remaining cols
			for (iterator = startRowIndex; iterator < endRowsIndex; ++iterator) {
				System.out.print(mat[iterator][endColumnsIndex - 1] + " ");
			}
			endColumnsIndex--;

			// Print the last row from the remaining rows */
			if (startRowIndex < endRowsIndex) {
				for (iterator = endColumnsIndex - 1; iterator >= startColumnIndex; --iterator) {
					System.out.print(mat[endRowsIndex - 1][iterator] + " ");
				}
				endRowsIndex--;
			}

			// Print the first column from the remaining cols
			if (startColumnIndex < endColumnsIndex) {
				for (iterator = endRowsIndex - 1; iterator >= startRowIndex; --iterator) {
					System.out.print(mat[iterator][startColumnIndex] + " ");
				}
				startColumnIndex++;
			}
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		int rows = 4;
		int cols = 4;
		int matrix[][] = {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};

		// Function Call
		TraverseMatrixPrint(rows, cols, matrix);
	}
}
