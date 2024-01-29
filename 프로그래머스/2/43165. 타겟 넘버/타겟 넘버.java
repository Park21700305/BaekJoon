public class Solution {
    public int solution(int[] numbers, int target) {
        return countWays(numbers, target, 0, 0);
    }

    private int countWays(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        } else {
            return countWays(numbers, target, index + 1, sum + numbers[index]) +
                   countWays(numbers, target, index + 1, sum - numbers[index]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution.solution(numbers, target)); 

        int[] numbers2 = {4, 1, 2, 1};
        int target2 = 4;
        System.out.println(solution.solution(numbers2, target2));
    }
}
