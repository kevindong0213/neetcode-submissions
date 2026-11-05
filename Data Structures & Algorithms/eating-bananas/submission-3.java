class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = piles[0];
        // 找max
        for (int pile : piles) {
            maxPile = Math.max(pile, maxPile);
        }

        int left = 1;
        int right = maxPile;
        int mid = 0;
        int answer = 0;
        while (left <= right) {
            mid = left + (right - left)/2;

            if (eat(mid, piles, h)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

            // 計算function
        boolean eat(int k, int[] piles, int h) {
            long totalHour = 0;
            for (int pile : piles) {
                totalHour += (pile + k - 1)/k;
            }
            if (totalHour <= h) {
                return true;
            } else {
                return false;
            }
        }
}
