class TimeMap {
    HashMap<String, List<String[]>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new String[]{String.valueOf(timestamp), value});
    }
    
    public String get(String key, int timestamp) {
        String res = "";
        if (map.containsKey(key)) {
            List<String[]> list = map.get(key);
            int left = 0;
            int right = list.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int midTime = Integer.parseInt(list.get(mid)[0]);
                if (midTime <= timestamp) {
                    res = list.get(mid)[1];
                    left = mid + 1;
                } else if (midTime > timestamp) {
                    right = mid - 1;
                }
            }
            return res;
        }
        return res;
    }
}
