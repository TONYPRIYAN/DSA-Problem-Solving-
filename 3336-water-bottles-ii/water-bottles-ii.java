class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int tot = numBottles;

        int empty = numBottles;

        while (empty >= numExchange) {

            empty -= numExchange;
            numExchange++;
            tot++;
            empty++;

        }

        return tot;

    }
}