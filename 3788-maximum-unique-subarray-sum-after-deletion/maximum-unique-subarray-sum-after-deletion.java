class Solution {
    public int maxSum(int[] nums) 
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();

        for(int x : nums)
        {
            max = Math.max(max,x);
            if(x <=0 || set.contains(x))
            continue;

            sum += x;
            set.add(x);
        }

        return (max <=0 )?max:sum;
        
    }
}