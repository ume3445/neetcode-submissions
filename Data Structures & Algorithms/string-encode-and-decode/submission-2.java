class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for (int i = 0; i < strs.size(); i++) {
            encodedString += strs.get(i).length() + "#" + strs.get(i);
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int j = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, j));
            for (int b = j + 1; b < j +length + 1; b++) {
                char c = str.charAt(b);
                answer += c;
            }
            list.add(answer);
            answer = "";
            i = j + length;
        }
        return list;
    }
}
