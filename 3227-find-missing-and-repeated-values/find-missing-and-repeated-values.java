class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {

        int n = grid.length;

        long num = (long)n*n;

        long SN = (num * (num+1))/2;
        long SSN = (num * (num+1) * (2 * num + 1))/6;

        long S = 0;
        long SS =  0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                S += (long)grid[i][j];
                SS += ((long)grid[i][j] * (long)grid[i][j]);


            }
        }

        long val1 = S - SN;
        long val2 = SS - SSN;

        long sum = val2/val1;

        long repeat = (val1 + sum)/2;

        long miss = repeat - val1;

        return new int[]{(int)repeat,(int)miss};        
    }
}