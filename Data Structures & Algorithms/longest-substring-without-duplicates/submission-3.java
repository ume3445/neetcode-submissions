class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char char1 = s.charAt(i);
            c[i] = char1;
        }
        int i = 0;
        int j = 1;
        int size = 0;
        if (s == null || s.isEmpty()) {
            return 0;
        } else{
            set.add(c[i]);
            while (j < c.length) {
                if (set.contains(c[j])) {
                    while (set.contains(c[j])) {
                        set.remove(c[i]);
                        i++;
                    }
                    size = Math.max(size, set.size());
                    set.add(c[i]);
                    set.add(c[j]);
                } else {
                    set.add(c[j]);
                    size = Math.max(size, set.size());
                }
                j++;
            }

        }
        return Math.max(size, set.size());
    }
}
