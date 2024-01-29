public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int originalX = x;
        
        while (x > 0) {
            sum += x % 10; // 숫자의 각 자릿수를 더함
            x /= 10; // 다음 자릿수로 이동
        }
        
        return originalX % sum == 0; // 원래 숫자를 자릿수의 합으로 나누어 떨어지는지 확인
    }
}
