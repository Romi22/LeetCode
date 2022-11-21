class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       
        
        int row = image.length;
        
        int col = image[0].length;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0,k = col-1; j < col && k > j; j++, k--)
            {
                    int temp = image[i][j];
                    image[i][j] = image[i][k];
                    image[i][k] = temp;
            }
        }
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(image[i][j] == 1)
                    image[i][j] = 0;
                else if(image[i][j] == 0)
                    image[i][j] = 1;
                    
            }
        }
        
        return image;
    }
}
