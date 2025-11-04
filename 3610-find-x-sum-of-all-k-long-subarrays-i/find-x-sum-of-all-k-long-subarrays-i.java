class Solution {
    public int[] findXSum(int[] nums, int k, int x) {

        int n = nums.length;
        int[] res = new int[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        res[0] = xsum(freq, x);

        for (int i = k; i < n; i++) {
            int out = nums[i - k];
            int in = nums[i];

            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0)
                freq.remove(out);

            freq.put(in, freq.getOrDefault(in, 0) + 1);

            res[i - k + 1] = xsum(freq, x);
        }

        return res;

    }

    int xsum(Map<Integer, Integer> freq, int x) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue()))
                return b.getValue() - a.getValue();
            return b.getKey() - a.getKey();
        });

        int sum = 0, count = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            if (count == x)
                break;
            sum += e.getKey() * e.getValue();
            count++;
        }

        return sum;
    }
}