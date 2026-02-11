class Solution {
    public int findMaxLength(int[] nums) 
    {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);


        int sum = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++)
        {
            int x = nums[i];

            if(x == 0)
                sum -= 1;
            else
                sum += 1;

            if(map.containsKey(sum))
            {
                max = Math.max(max,i - map.get(sum));
            }
            else
            {
                 map.put(sum,i);
            }

           




        }

        return max;
        
    }
}