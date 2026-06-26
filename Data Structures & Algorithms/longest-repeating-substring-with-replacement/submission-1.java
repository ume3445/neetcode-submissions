class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int res = 0;
        int mostFreq = 0;
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
               mostFreq = Math.max(mostFreq, e.getValue());
            }
            if (((j - i) + 1) - mostFreq <= k) {
                j++;
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++; 
            }
            res = Math.max(((j - i)), res);
        }
        return res;
    }
}
