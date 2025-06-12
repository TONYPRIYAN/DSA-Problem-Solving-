class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        return bt(matrix,target);
    }

    public boolean bt(int[][] matrix, int target)
    {
        for(int[] arr : matrix)
        {
            for(int x : arr)
            {
                if(x == target) return true;
            }
        }
        return false;
    }
}