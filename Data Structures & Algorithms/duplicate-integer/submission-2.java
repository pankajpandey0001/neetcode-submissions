class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupli_check = new HashSet<>();
        for (int i:nums) {
            if (dupli_check.add(i)==false) {
                return true;
            }
        }
        return false;
    }
}