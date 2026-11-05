class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Map<Integer, Boolean> map = new HashMap<>();
        // for (int number : nums) {
        //     if (map.containsKey(number)) {
        //         return true;
        //     }
        //     map.put(number, false);
        // }
        // return false;
        Set<Integer> seen = new HashSet<>();
        for (int number : nums) {
            if (seen.contains(number)) {
                return true;
            }
            seen.add(number);
        }
        return false;

    }
}