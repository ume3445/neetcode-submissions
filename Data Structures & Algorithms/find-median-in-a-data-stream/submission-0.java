/**


Placement: the lower.isEmpty() || num <= lower.peek() check, with the number going into lower or upper.
The two size checks: one for lower too big, one for upper too big, each moving a root across with poll and offer.

*/



class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        double median;
        if (minHeap.size() == maxHeap.size()) {
            median = (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            median = maxHeap.peek();
        }

        return median;
    }
}
