class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {

        int tot = numBottles;

        int empty = numBottles;

        while(empty >= numExchange)
        {

            tot += empty / numExchange;
            empty  = (empty / numExchange) + (empty % numExchange);
        }


        return tot;
        
    }
}