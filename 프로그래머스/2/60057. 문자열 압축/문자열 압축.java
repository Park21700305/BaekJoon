class Solution {
    public int solution(String s) {
        int len = s.length(), min = len;
        for (int i = 1; i <= len / 2; i++) {
            String prev = "", compressed = "";
            int count = 1;
            for (int j = 0; j < len; j += i) {
                String sub = s.substring(j, Math.min(j + i, len));
                if (prev.equals(sub)) {
                    count++;
                } else {
                    compressed += (count > 1 ? count : "") + prev;
                    prev = sub;
                    count = 1;
                }
            }
            compressed += (count > 1 ? count : "") + prev;
            min = Math.min(min, compressed.length());
        }
        return min;
    }
}
