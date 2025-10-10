class NumArray {

    int[] Sum;
    public NumArray(int[] nums) {
        Sum = nums;

        for(int i=1;i<nums.length;i++)
        {
            Sum[i] +=  nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        
        if(left == 0)
        {
            return Sum[right];
            
        }
        return Sum[right]- Sum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */