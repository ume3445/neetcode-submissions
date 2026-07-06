class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < position.length; i++) {
            int a = position[i] / speed[i];
            int b = target / speed[i];
            int iterations = b - a;
            map.put(iterations, map.getOrDefault(iterations, 0) + 1);
        }
        return map.size();
    }
}
