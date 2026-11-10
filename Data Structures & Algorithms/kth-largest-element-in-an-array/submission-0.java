/**
Alright to understand this question you want kth largest element
First thing that pops up into my head is that you probably need a min heap
Have it at a certain size 
And then at the end just poll and return that answer

*/


class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            minHeap.offer(c);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
        
    }
}
