class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for (int i:nums) {
            check.add(i);
        }
        int count=0;
        for (int i:check) {
            if (!check.contains(i-1)) {
                int length = 1;
                while (check.contains(i + length)) {
                    length++;
                }
                count = Math.max(count, length);
            }
        }
        return count;
    }
}
