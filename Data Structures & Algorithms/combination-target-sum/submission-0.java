class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, int remain, List<Integer> path, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start;i < nums.length;i++) {
            if (nums[i] > remain) {
                break;
            }

            path.add(nums[i]);
            backtrack(nums, i, remain - nums[i], path, result);
            path.remove(path.size() - 1);
        }

    }
}
