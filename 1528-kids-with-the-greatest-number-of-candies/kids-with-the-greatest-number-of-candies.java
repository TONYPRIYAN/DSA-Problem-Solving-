class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> arr = new ArrayList<>();


        int max = Arrays.stream(candies).max().getAsInt();

        for(int x : candies)
        {
            arr.add((extraCandies + x) >= max);
           
        }

        return arr;
        
    }
}