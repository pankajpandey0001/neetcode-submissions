class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] check = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for (int i=1; i<check.length; i++) {
            check[i] = new ArrayList<>();
        }

        for (int i:nums) {
            count.put(i, count.getOrDefault(i, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            check[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int index = 0;
        for (int i = check.length - 1; i > 0 && index < k; i--) {
            for (int n : check[i]) {
                ans[index++] = n;
                if (index == k) {
                    return ans;
                }
            }
        }
        return ans;
    }
}