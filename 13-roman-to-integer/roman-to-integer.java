class Solution {
    public int romanToInt(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int tot = 0;
        int i = 0;
        while(i < s.length()-1)
        {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))
            {
                tot += map.get(s.charAt(i));
                i++;
            }
            else
            {
                int num = map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                tot += num;
                i+=2;
            }

        }

        if(i < s.length())
        {
            tot+=map.get(s.charAt(i));
        }

        return tot;

        
    }
}