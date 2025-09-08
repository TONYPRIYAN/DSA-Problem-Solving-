class Solution {
    public int carFleet(int target, int[] position, int[] speed) 
    {
        int f = position.length;
        Map<Integer,Float> map =  new HashMap<>();

        for(int i=0;i<position.length;i++)
        {
            float rem = ((float)target - position[i])/speed[i];
            map.put(position[i],rem);
        }

        Arrays.sort(position);
        int i = position.length -1;
        while(i > 0)
        {
            float c = map.get(position[i]);
            i--;
            while(i >= 0 && c >= map.get(position[i]))
            {
                f--;
                i--;
            }
        }

        return f;
    }
}