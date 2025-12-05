class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;


        Arrays.sort(nums);

        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<n;j++)
            {
                if(j > i+1 && nums[j]==nums[j-1]) continue;


                int l = j+1;
                int r = n-1;

                while(l<r)
                {
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];

                    if(sum == target)
                    {
                        arr.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));

                        while(l < r && nums[l] == nums[l+1]) l++;
                        while(l < r && nums[r] == nums[r-1]) r--;

                        l++;
                        r--;

                    }
                    else if(sum < target)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }

            }
        }

        return arr;
    }
}