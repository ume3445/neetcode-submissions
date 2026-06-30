class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int windowSize = Integer.MAX_VALUE;
        int need = t.length();
        int r = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (map.getOrDefault(c, 0) > 0) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                need--;
            } 

            while (need == 0) {
                int temp = 0;
                if (!map.containsKey(s.charAt(i))) {
                    temp = (j-i) + 1;
                    windowSize = Math.min(temp, windowSize);
                    r = i;
                    i++;
                } else {
                    temp = (j-i) + 1;
                    windowSize = Math.min(temp, windowSize);
                    r = i;
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                    need++;
                    i++;
                 }
            }

            continue;
        }

        if (windowSize == Integer.MAX_VALUE) {
            return "";
        }

        StringBuilder sb = new StringBuilder(windowSize);
        for (int x = r; x <  r + windowSize; x++) {
            sb.append(s.charAt(x));
        }
        return sb.toString();
    }
}
 