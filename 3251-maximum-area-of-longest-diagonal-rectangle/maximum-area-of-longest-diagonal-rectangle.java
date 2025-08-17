class Solution {
    public int areaOfMaxDiagonal(int[][] arr) 
    {
        int n = arr.length;

        int area = 0;
        int MaxDiag = 0;

        for(int i=0;i<n;i++)
        {
            int l = arr[i][0];
            int w = arr[i][1];

            int diag = l * l + w * w;

            if(diag > MaxDiag || (diag == MaxDiag && l * w > area))
            {
                MaxDiag = diag;
                area = l * w;
            }
        }

        return area;
        
    }
}