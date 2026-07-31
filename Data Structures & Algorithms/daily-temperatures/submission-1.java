class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> index = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i=0; i<temperatures.length; i++) {
            while (!index.isEmpty() && temperatures[index.peek()]<temperatures[i]) {
                ans[index.peek()] = i-(index.pop());
            }
            index.push(i);
        }
        return ans;
    }
}
