import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 케이스의 개수
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int score = 0, sum = 0;
            for (char c : s.toCharArray()) {
                if (c == 'O') sum += ++score;
                else score = 0;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
