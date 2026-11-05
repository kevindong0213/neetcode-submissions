class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length - 1;
        while(l != r) {
            int ans = numbers[l] + numbers[r];
            if (ans == target) {
                return new int[]{l+1,r+1};
            } else if (ans > target) {
                r--;
            } else {
                l++;
            }
        }
        return null;
    }
}
