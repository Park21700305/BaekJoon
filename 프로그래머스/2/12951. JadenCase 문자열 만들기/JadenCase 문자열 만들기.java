public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else { // 공백 문자인 경우
                result.append(c);
                capitalizeNext = true;
            }
        }

        return result.toString();
    }
}
