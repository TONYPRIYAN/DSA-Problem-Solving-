class Solution {
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;  
            }
        }

        

        for(int[] row : matrix)
        {
            int l = 0;
            int r = n-1;
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