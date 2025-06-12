class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        return bt(matrix,target);
    }

    public boolean bt(int[][] matrix, int target)
    {
        for(int[] arr : matrix)
        {
           int l = 0;
           int r = arr.length-1;

           while(l <= r)
           {
            int mid = l + (r-l)/2;
            if(arr[mid] == target) return true;

            if(arr[mid] > target)
            {
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
           }
        }
        return false;
    }
}