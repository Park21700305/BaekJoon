import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] hints = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            hints[i][0] = Integer.parseInt(st.nextToken());
            hints[i][1] = Integer.parseInt(st.nextToken());
            hints[i][2] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 123; i <= 987; i++) {
            if (isValid(i, hints)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isValid(int number, int[][] hints) {
        int[] digits = {number / 100, (number / 10) % 10, number % 10};

        if (digits[0] == 0 || digits[1] == 0 || digits[2] == 0 || digits[0] == digits[1] || digits[1] == digits[2] || digits[0] == digits[2]) {
            return false;
        }

        for (int[] hint : hints) {
            int strike = 0, ball = 0;
            int[] hintDigits = {hint[0] / 100, (hint[0] / 10) % 10, hint[0] % 10};

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (digits[i] == hintDigits[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            if (strike != hint[1] || ball != hint[2]) {
                return false;
            }
        }
        return true;
    }
}
