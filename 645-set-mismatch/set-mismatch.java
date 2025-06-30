class Solution {
    public int[] findErrorNums(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int a = -1;
        int b = -1;

        for(int i=1;i<=nums.length;i++)
        {
            if(map.containsKey(i))
            {
               if(map.get(i) == 2)
            {
                a = i;
            }
            
            }
             else
            {
                b=i;
            }
            
        }

        return new int[]{a,b};
    }
}