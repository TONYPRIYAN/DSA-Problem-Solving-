class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int x : nums1)
        {
            set1.add(x);
        }

        for(int x : nums2)
        {
            set2.add(x);
        }

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());

        for(int x : set1)
        {
            if(!set2.contains(x))
            {
                arr.get(0).add(x);
            }
        }

        for(int x : set2)
        {
            if(!set1.contains(x))
            {
                arr.get(1).add(x);
            }
        }

        return arr;
    }
}