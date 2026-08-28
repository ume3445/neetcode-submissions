/*
inputs we have two strings s and t
we need to output a boolean if they are anagrams
So what we do is put both of them in an array and then sort the array
And then if the arrays are equal we will have an anagram
One thing that I will check before everything is that is the length same if not it can not be an anagram
so now to optimise this since this was O(n log n + m logm)
We are going to use two hashmaps. Put the chars in the hashmap with their frequencies

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sMap.equals(tMap);
    }
}
