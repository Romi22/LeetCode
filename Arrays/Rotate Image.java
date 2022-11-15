//https://leetcode.com/problems/rotate-image/


/** first swap rows , then change rows->cols & cols->row */


class Solution {
    public void rotate(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i = 0, j = r-1; i < j; i++,j--)
        {
                int temp[] = matrix[i];
                matrix[i] = matrix[j];
                matrix[j] = temp;
        }
        
        for(int i = 0; i < r; i++)
        {
            for(int j = i; j < c; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
