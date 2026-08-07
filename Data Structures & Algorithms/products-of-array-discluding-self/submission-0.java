class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lr_ans = new int[n];
        int[] rl_ans = new int[n];
        int[] result = new int[n];

        lr_ans[0] = 1;
        for (int i = 1; i < n; i++) {
            lr_ans[i] = lr_ans[i - 1] * nums[i - 1];
        }

        rl_ans[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rl_ans[i] = rl_ans[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = lr_ans[i] * rl_ans[i];
        }

        return result;
    }
}
