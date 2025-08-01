class Solution {
    public List<List<Integer>> generate(int numRows) 
    {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1));


        for(int i=0;i<numRows-1;i++)
        {
            List<Integer> dummy = new ArrayList<>();
            dummy.add(0);
            dummy.addAll(arr.get(arr.size()-1));
            dummy.add(0);

            List<Integer> arr2 = new ArrayList<>();
            for(int j=0;j<dummy.size()-1;j++)
            {
                arr2.add(dummy.get(j)+dummy.get(j+1));
            }

            arr.add(arr2);
        }

        return arr;



        
    }
}