import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int idx = 0;

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int score = scanner.nextInt();
                sum += score;
            }
            if (sum > max) {
                max = sum;
                idx = i;
            }
        }

        System.out.println(idx + " " + max);
        scanner.close();
    }
}
