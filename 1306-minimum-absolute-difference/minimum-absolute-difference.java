class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            min = Math.min(min,(arr[i]-arr[i-1]));
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                ans.add(pair);
            }
        
        
    }

    return ans;
    }
}
