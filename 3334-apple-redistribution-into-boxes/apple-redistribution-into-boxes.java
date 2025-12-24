class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) 
    {

        int count = 0;

        Arrays.sort(capacity);

        int sum = 0;
        for(int x : apple)
        {
            sum += x;
        }

        int n = capacity.length;

        int cap = 0;

        for(int i=n-1;i>=0;i--)
        {
            if(cap >= sum)
            {
                
                return count;
            }
            
            cap+= capacity[i];
            count++;
        }

        if(cap >= sum) return count;

        return -1;
        
    }
}