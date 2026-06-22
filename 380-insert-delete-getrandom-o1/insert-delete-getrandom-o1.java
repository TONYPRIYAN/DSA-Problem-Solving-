class RandomizedSet {

    Random rand;
    HashMap<Integer,Integer> map;
    ArrayList<Integer> arr;

    public RandomizedSet() 
    {
        rand = new Random();
        map = new HashMap<>();
        arr = new ArrayList<>();
        
    }
    
    public boolean insert(int val) 
    {
        if(map.containsKey(val))
        {
            return false;
        }

        map.put(val,arr.size());
        arr.add(val);
        return true;
        
    }
    
    public boolean remove(int val) 
    {
        if(!map.containsKey(val))
        {
            return false;
        }

        int idx = map.get(val);
        if(idx < arr.size()-1)
        {
            int ele = arr.get(arr.size()-1);
            arr.set(idx,ele);
            map.put(ele,idx);
        }

        map.remove(val);
        arr.remove(arr.size()-1);
        return true;
        
    }
    
    public int getRandom() 
    {
        return arr.get(rand.nextInt(arr.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */