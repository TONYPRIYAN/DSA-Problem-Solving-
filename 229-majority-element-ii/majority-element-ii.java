class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {

        int n = nums.length;
        int cnt = 0;
        int ele = 0;
        int cnt2 = 0;
        int ele2 = 0;


        List<Integer> list = new ArrayList<>();

        for(int x : nums)
        {
            
            if(ele == x)
            {
                cnt++;
            }
            else if(ele2 == x)
            {
                cnt2++;
            }
            else if(cnt == 0)
            {
                cnt = 1;
                ele = x;
            }
            else if(cnt2 == 0)
            {
                cnt2 = 1;
                ele2 = x;
            }
            else
            {
                cnt--;
                cnt2--;
            }
        }


        cnt = 0;
        cnt2 = 0;
        for(int x : nums)
        {
            if(x == ele) cnt++;
            if(x == ele2) cnt2 ++;
        }

        if(cnt > n/3) list.add(ele);
        if(cnt2 > n/3 && ele != ele2) list.add(ele2);


        return list;

    }
}