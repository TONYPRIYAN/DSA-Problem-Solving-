class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k)
    {
        
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] == key)
                {
                    if(Math.abs(i-j) <= k)
                    {
                        arr.add(i);
                        break;
                    }
                }
            }
        }

        Collections.sort(arr);
        return arr;
    }
}