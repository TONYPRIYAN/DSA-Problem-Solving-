class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> arr = new ArrayList<>();
       
       if(nums.length == 0) return arr;

       int start  = 0;
       int end = 0;

       for(int i=0;i<nums.length;i++)
       {

        while(i < nums.length-1 && nums[i]+1 == nums[i+1])
        {
            end++;
            i++;
        }

        if(start == end) arr.add(String.valueOf(nums[start]));
        else arr.add(nums[start]+"->"+nums[end]);

        end++;
        start = end;

       }

      

    

    return arr;
}
}