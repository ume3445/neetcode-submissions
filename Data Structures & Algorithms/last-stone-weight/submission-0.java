/**
take the two heaviest two stones
that basically means that you go through the array
looking at a maxheap you would have the heaviest stone at the root. 


*/


class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            maxHeap.offer(stones[i]);
        }
        while (maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if (x == y) {
                continue;
            } else if (x < y) {
                y = y - x;
                maxHeap.offer(y);
            } else if (x > y) {
                x = x - y;
                maxHeap.offer(x);
            }
        }
        if (maxHeap.isEmpty()) {
            return 0;
        } else {
            return maxHeap.peek();
        }


    }
}
