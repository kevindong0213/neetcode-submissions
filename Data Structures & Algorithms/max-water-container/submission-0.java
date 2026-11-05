class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r =heights.length - 1;
        int ans = 0;
        while (l < r) {
            ans = Math.max(ans,(r -l)* Math.min(heights[l], heights[r]));
            if (heights[l] >= heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return ans;
        
    }
}
