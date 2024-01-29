import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        // k개의 숫자를 제거하지 못한 경우 뒤에서부터 제거
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        // 스택에 남은 숫자를 문자열로 변환
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        return result.toString();
    }
}
