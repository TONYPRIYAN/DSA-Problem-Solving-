class Solution {
    public int[] separateDigits(int[] nums) 
    {

        List<Integer> list = new ArrayList<>();
        for (int n : nums) {

            String s = String.valueOf(n);

            for (char ch : s.toCharArray()) {

                list.add(ch - '0');
            }
        }

        int[] arr = new int[list.size()];

        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }

        return arr;
        
        
    }
}