class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0;i < s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0;i < t.length();i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false; // 只要有一個字母數量沒抵消，就不是 Anagram
            }
        }
        return true;
    }
}
