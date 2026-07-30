class Solution {
    public int maxArea(int[] heights) {
        int l=0, r=heights.length-1, max=0;
        while (l<r) {
            if (heights[l] < heights[r]) {
                int n = heights[l]*(r-l);
                if (max<n) {
                    max = n;
                }
                l++;
            }
            else if (heights[r] < heights[l]) {
                int n = heights[r]*(r-l);
                if (max<n) {
                    max = n;
                }
                r--;
            }
            else {
                int n = heights[r]*(r-l);
                if (max<n) {
                    max = n;
                }
                r--;
            }
        }
        return max;
    }
}
