/**
Alright so for this question you are given an array of char
For a task completion what you basically need is that lets say you have x and y it will only take 2 tries
so now for example x x y y do it in the order x y x y x starts so 1 added then y so then 
so now 2 operations done but since x needs a cooldown of 2 you do another 1 and then you do x so now it should be 4 and after that just do y once more to get 5

now you essentially have a maxHeap which now has all of the frequencies of your chars now you have nothing to do with chars. You will now be taking the top one out using poll and then you are probably going to be reducing it by 1 if it is not zero you put it in the waiting area. The waiting area will run for n times. Now how do you implement the waiting area you could use a while loop and put it in there and then you put it back in the maxHeap if there is nothing in the maxheap but there is still something in the waiting area then you keep adding one so one loop that you are going to be needing is while (waiting area and maxheap are not completely empty) you don't stop then you poll then you put it in the waiting area

alright so for the waiting area what I could use is a hashmap
but lets start on something else lets get the first part of it continue


*/

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            char c = tasks[i];
            freq[c - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                maxHeap.offer(freq[i]);
            }
        }
        int res = 0;
        Queue<int[]> waitingArea = new LinkedList<>();
        while (!maxHeap.isEmpty() || !waitingArea.isEmpty()) {
            res++;
            if (!waitingArea.isEmpty() && waitingArea.peek()[1] <= res) {
                maxHeap.offer(waitingArea.poll()[0]);
            }
            if (!maxHeap.isEmpty()) {
                int wait = maxHeap.poll();
                wait--;
                if (wait > 0) {
                        waitingArea.offer(new int[] {wait, res + n + 1});
                }
            }
        }
        return res;
    }
}
