class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer> nums = new ArrayList<>();

        for(int x : nums1)
        {
            nums.add(x);
        }

        for(int x : nums2)
        {
            nums.add(x);
        }

        Collections.sort(nums);
        int mid = (nums.size()-1)/2;

        if(nums.size() %2 == 0)
        {
            return (double) (nums.get(mid)+nums.get(mid+1))/2;
        }
        else
        {
            return (double) nums.get(mid);
        }
        
    }
}