// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
public class A14_transpose_matrix {
    class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int newMatrix[][] = new int[n][m];
        for(int row = 0; row<m;row++){
            for(int col = 0;col<n;col++){
                newMatrix[col][row] = matrix[row][col];
            }
        }
        return newMatrix;
    }
}
}
