 /*
Question ->
  
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
  
  
Logic ->
        In this challenge we are using two for each loop first for row and second for coloumn in this loop we chack the condition if col < 0 ,
        then increment the value of count and return count
  
 */

Solution ->
  class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int [] row  : grid){
            for(int col : row){
                if(col < 0){
                    count++;
                }
            }
        }
        return count;

    }
}
