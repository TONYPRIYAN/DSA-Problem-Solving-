class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> arr = new ArrayList<>();
       
       if(nums.length == 0) return arr;

       int start  = nums[0];

       for(int i=1;i<=nums.length;i++)
       {
        if(i == nums.length || nums[i] != nums[i-1]+1)
        {
            if(nums[i-1] == start)
            {
                arr.add(String.valueOf(start));
            }
            else
            {
                arr.add(start+"->"+nums[i-1]);
            }
        if(i<nums.length)
       {
        start = nums[i];
       }
       }

       
 
    }

    return arr;
}
}