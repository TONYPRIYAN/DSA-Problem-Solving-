class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> arr = new ArrayList<>();


        int max = Integer.MIN_VALUE;
        for(int x : candies)
        {
            max = Math.max(max,x);
        }

        for(int x : candies)
        {
            if((extraCandies + x) >= max)
            {
                arr.add(true);
            }
            else
            {
                arr.add(false);
            }
        }

        return arr;
        
    }
}