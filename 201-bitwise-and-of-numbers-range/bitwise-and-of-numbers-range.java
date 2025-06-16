class Solution {
    public int rangeBitwiseAnd(int left, int right) 
    {
        if(left == 0 || right == 0 ) return 0;

        while(right > left)
        {
            right &= right -1;
        }

        return right;
    }
}