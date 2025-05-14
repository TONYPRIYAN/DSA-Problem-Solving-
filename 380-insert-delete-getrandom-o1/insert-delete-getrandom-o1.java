class RandomizedSet {

    HashMap<Integer,Integer> map;
    ArrayList<Integer> arr;
    java.util.Random rand =  new java.util.Random();

    
    public RandomizedSet() 
    {
        map = new HashMap<>();
        arr = new ArrayList<>();
        
    }
    
    public boolean insert(int val) 
    {
        boolean chk = map.containsKey(val);
        if (chk) return false;

        map.put(val,arr.size());
        arr.add(val);
        return true;
        
        
    }
    
    public boolean remove(int val) 
    {
        boolean chk = map.containsKey(val);
        if (!chk) return false;

        int idx = map.get(val);
        if(idx < arr.size() -1)
        {
            int idx2 = arr.get(arr.size()-1);
            arr.set(idx,idx2);
            map.put(idx2,idx);
            
        }
        map.remove(val);
        arr.remove(arr.size()-1);
        return true;

        
    }
    
    public int getRandom() 
    {
        return arr.get(rand.nextInt(arr.size()) );
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */