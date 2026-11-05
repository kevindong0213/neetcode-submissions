class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int privot = (left + right)/2;
            if (nums[privot] == target) {
                return privot;
            } else if (nums[privot] < target) {
                left++;
            } else {
                right--;
            }
        }

        return -1;
    }
}
