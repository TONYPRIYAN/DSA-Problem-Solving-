class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) 
    {
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        List<Integer> valid = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i]
                    && code[i] != null
                    && code[i].matches("^[a-zA-Z0-9_]+$")
                    && order.containsKey(businessLine[i])) {

                valid.add(i);
            }
        }

        Collections.sort(valid, (i, j) -> {
            int blCompare = order.get(businessLine[i]) - order.get(businessLine[j]);
            if (blCompare != 0) return blCompare;
            return code[i].compareTo(code[j]);
        });

        List<String> result = new ArrayList<>();
        for (int i : valid) {
            result.add(code[i]);
        }

        return result;
        
    }
}