class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>(nums.length);
        for (int n:nums) {
            if (!check.add(n)) {
                return true;
            }
        }
        return false;
    }
}