class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> check = new HashMap<>(nums.length);
        for (int i=0; i<nums.length; i++) {
            int a = target-nums[i];
            if(check.containsKey(a)) {
                return new int[] { check.get(a), i };
            }
            check.put(nums[i], i);
        }
        return new int[] {};
    }
}
