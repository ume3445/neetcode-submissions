class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        int i = 0;
        int j = s1.length();
        boolean res = false;
        while (j < s2.length()) {
            int size = 0;
            if (i != j) {
                if (set.contains(s2.charAt(i))) {
                    size++;
                    i++;
                } else {
                    i++;
                }
            } else {
                i = j - s1.length();
                j++;
            }
            if (size == s1.length() - 1) {
                res= true;
            }
        }
        return res;
        
    }
}
