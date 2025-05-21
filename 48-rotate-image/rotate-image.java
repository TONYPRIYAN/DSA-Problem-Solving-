class Solution {
    public void rotate(int[][] matrix) 
    {
        for(int i=0;i<=matrix.length-2;i++)
        {
            for(int j=i+1;j<=matrix[0].length-1;j++)
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;

            }
        }

        

       for(int[] row : matrix)
       {
        int l=0;
        int r = matrix.length-1;
        while(l < r)
        {
            int tmp = row[l];
            row[l] = row[r];
            row[r] = tmp;
            l++;
            r--;
        }
       }
        
    }
}



























  

    //  }