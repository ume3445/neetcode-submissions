/*
Alright so for this I will be using a hashmap. 
I will go through s and put everything in a hashmap. Then I will go through t and cross check. The cross check will happen when I subtract the number of occurrunces and if everything is at zero that means that is okay!!


*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }
}
