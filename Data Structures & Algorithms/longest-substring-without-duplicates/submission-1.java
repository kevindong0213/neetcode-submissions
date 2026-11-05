class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // 把新字元吃進窗口，次數 +1
            count.put(c, count.getOrDefault(c, 0) + 1);

            // 剛吃進來的字元重複了，就縮左邊直到它只剩一個
            while (count.get(c) > 1) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            int windowLength = right - left + 1;
            if (windowLength > ans) {
                ans = windowLength;
            }
        }

        return ans;
    }
}
