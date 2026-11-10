/**
Alright to understand this question you basically have a 2d array which represent points
an array in an array
Every points[i] is [xi, yi]

need k closest points

you find the distance add that in your priority queue and then you just keep updating it 
So for example k is 2 you add 3 once it is more than k you just poll() one and then you should have your answer use maxHeap

Understanding the equation since you are checking with origin always have x2 and y2 as 0

so the equation should be for i in points
Math.sqrt((points[i][0]^2 + points[i][1]^2))
then you put it in heap

*/


class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            int da = ((a[0] * a[0]) + (a[1] * a[1]));
            int db = ((b[0] * b[0]) + (b[1] * b[1]));
            return db - da;
        });
        for (int i = 0; i < points.length; i++) {
            maxHeap.offer(points[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }

        }
        int[][] res = new int[k][1];
        while (!maxHeap.isEmpty()) {
            for (int i = 0; i < res.length; i++) {
                res[i] = maxHeap.poll();
            }
        }
        return res;
    }
}
