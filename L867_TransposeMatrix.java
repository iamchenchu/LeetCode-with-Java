/*Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
*/


public class L867_TransposeMatrix {
    public static int[][] transposeMatrix(int[][] matrix){
        int rows = matrix.length;
        int colums = matrix[0].length;
        
        int[][] new_matrix = new int[colums][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                new_matrix[j][i] = matrix[i][j];
            }
        }

        return new_matrix;
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                           {7, 8, 9}};
        L867_TransposeMatrix obj = new L867_TransposeMatrix();
        int[][] result = obj.transposeMatrix(matrix);
        System.out.println(result);

    }

    
}
