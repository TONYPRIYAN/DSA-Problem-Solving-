class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {

        int max = candies[0];

        List<Boolean> list = new ArrayList<>();

        for(int x : candies)
        {
            max = Math.max(max,x);
        }

        for(int x : candies)
        {
            list.add(x + extraCandies >= max);
            
        }

        return list;


        
        
    }
}