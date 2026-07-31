class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> check = new HashMap<>();
        for (int i:nums) {
            if (check.putIfAbsent(i, 1)!=null) {
                check.put(i, check.get(i) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>(check.keySet());
        ans.sort((a, b) -> check.get(b) - check.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
