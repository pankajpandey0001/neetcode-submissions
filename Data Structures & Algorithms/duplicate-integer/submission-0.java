class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Set<Integer> value = new java.util.HashSet<>();
        for (int i:nums) {
            if (value.add(i)==false){
                return true;
            }
        }
        return false;
    }
}