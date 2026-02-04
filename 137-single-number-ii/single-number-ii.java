class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 3) {
            if (i + 2 >= nums.length || nums[i] != nums[i + 2]) {
                return nums[i];
            }
        }

        return -1; 
    }
}
