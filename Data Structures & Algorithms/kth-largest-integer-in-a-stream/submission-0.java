class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);

        // 超過 k 個，就把最小的踢掉
        if (minHeap.size() > k) {
            minHeap.poll();
        } 

        // heap 頂端 = 前 k 大裡最小的 = 第 k 大
        return minHeap.peek();
    }
}
