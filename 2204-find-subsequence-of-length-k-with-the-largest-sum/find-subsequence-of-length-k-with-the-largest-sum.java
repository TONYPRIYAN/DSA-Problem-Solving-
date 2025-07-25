class Solution {
    public int[] maxSubsequence(int[] nums, int k) 
    {
       int n = nums.length;
        int[][] indexAndVal = new int[n][2];
        for (int i = 0; i < n; ++i) {
            indexAndVal[i] = new int[]{i, nums[i]};
        }
        
        Arrays.sort(indexAndVal, Comparator.comparingInt(a -> -a[1]));
        int[][] maxK = Arrays.copyOf(indexAndVal, k);
       
        Arrays.sort(maxK, Comparator.comparingInt(a -> a[0]));
        int[] seq = new int[k];
        for (int i = 0; i < k; ++i) {
            seq[i] = maxK[i][1];
        }
        return seq;
    }
}