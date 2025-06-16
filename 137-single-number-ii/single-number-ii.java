class Solution {
    public int singleNumber(int[] nums) 
    {
        int ones = 0;
        int twos = 0;

        for(int n : nums)
        {
            twos = twos | (ones & n);

            ones = ones ^ n;

            int num = ~(ones & twos);

            ones = ones & num;
            twos = twos & num;
        }
        return ones;
        
    }
}