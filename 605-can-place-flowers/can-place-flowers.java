class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int len = flowerbed.length;

        for(int i=0;i<len && n>0;i++)
        {
            if(flowerbed[i] == 0){
            boolean left = (i == 0) || (flowerbed[i-1]==0);
            boolean right = (i == len-1) || (flowerbed[i+1]==0);

            if(left && right)
            {
                flowerbed[i] = 1;
                n--;
            }
            }
        }

        return n == 0;
        
    }
}