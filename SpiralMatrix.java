public class SpiralMatrix {
	//Given an m x n matrix, return all elements of the matrix in spiral order.
	// Example: matrix = [[1,2,3],[4,5,6],[7,8,9]] -> Output: [1,2,3,6,9,8,7,4,5]
	//LeetCode September 2021 challenge
	
	
	static void spiralMatrix(int matrix[][])
    {
		
		int rows=matrix.length, cols=matrix[0].length;
        int i, rowStart = 0, colStart = 0;
 
        
 
        while (rowStart < rows && colStart < cols) {
            // printing first row
            for (i = colStart; i < cols; ++i) {
                System.out.println(matrix[rowStart][i]);
            }
            rowStart++;
 
            // print the last column
            for (i = rowStart; i < rows; ++i) {
                System.out.println(matrix[i][cols - 1]);
            }
            cols--;
 
            // print last row
            if (rowStart < rows) {
                for (i = cols - 1; i >= colStart; --i) {
                    System.out.println(matrix[rows - 1][i]);
                }
                rows--;
            }
 
            // print first column
            if (colStart < cols) {
                for (i = rows - 1; i >= rowStart; --i) {
                    System.out.println(matrix[i][colStart]);
                }
                colStart++;
            }
        }
    }
	
	
	public static void main(String[] args) {
		
		int[][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
		
		spiralMatrix(matrix1);
	
	}
}
