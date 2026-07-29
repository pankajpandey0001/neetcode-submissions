class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cnum = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int num = target-nums[i];
            if (cnum.containsKey(num)) {
                return new int[]{cnum.get(num), i};
            }
            cnum.put(nums[i], i);
        }
        return new int[] {};
    }
}
