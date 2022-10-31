/*
Question ->
  
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.



 

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109
  
  
Logic ->
  In this question we are doing transpose of a metrix . First we create a variable row and initialize to length of matrix and second is col it is also initilize to ,
  matrix[0].length and we created a array arr  and run to iterative loop first is i=0 to i<row and second is j=0 to j<col in this loop ,
  we simply change the value of i to j and j to i and return arr.
  */
  
Solution ->
    class Solution {
    public int[][] transpose(int[][] matrix) {
        int row  =  matrix.length;
        int col  = matrix[0].length;
        int[][] arr =  new int[col][row];
        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                arr[j][i]  = matrix[i][j];
            }
        }
        return arr;
    }
}
