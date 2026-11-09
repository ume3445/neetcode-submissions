class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int j;
    public KthLargest(int k, int[] nums) {
        j = k;
        
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if (j < minHeap.size()) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
