class Solution {
    public int majorityElement(int[] nums) 
    {

        int cnt = 0;
        int ele = 0;

        for(int x : nums)
        {
            if(cnt == 0)
            {
                cnt = 1;
                ele = x;
            }
            else if(x == ele)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }

        cnt = 0;
        for(int x : nums)
        {
            if(x == ele) cnt++;
        }

        if(cnt > (nums.length)/2) return ele;

        return -1;
        
    }
}