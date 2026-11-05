class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int number : nums) {
        //     map.put(number, map.getOrDefault(number, 0) + 1);
        // }
        // List<Integer> bucket = new ArrayList<>();
        // for () {
        //     //塞入ARRAY 我想避免超出陣列
        // }
        
        // int[] answer = new int[k];
        // for () {
        //     //塞入anser return
        // }

            // 1. 數次數
    Map<Integer, Integer> map = new HashMap<>();
    for (int number : nums) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    // 2. 按次數丟進籃子：bucket[次數] = 出現這麼多次的數字們
    List<Integer>[] bucket = new List[nums.length + 1];
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int freq = entry.getValue();
        if (bucket[freq] == null) {
            bucket[freq] = new ArrayList<>();
        }
        bucket[freq].add(entry.getKey());
    }

    // 3. 從次數最高的籃子往回拿，拿滿 k 個就停
    int[] answer = new int[k];
    int idx = 0;
    for (int freq = bucket.length - 1; freq >= 1; freq--) {
        if (bucket[freq] == null) continue;
        for (int num : bucket[freq]) {
            answer[idx++] = num;
            if (idx == k) return answer;
        }
    }
    return answer;
    }
}
