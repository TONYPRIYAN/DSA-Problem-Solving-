class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {

        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list =  new ArrayList<>();

        int n = nums.length;

        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int x : map.keySet())
        {
            if(map.get(x) > n/3)
            {
                list.add(x);
            }
        }

        return list;
        
    }
}