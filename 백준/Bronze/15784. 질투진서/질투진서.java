import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 전체 학생들의 행과 열의 크기
        int a = Integer.parseInt(st.nextToken()) - 1; // 질투하는 학생의 행 위치
        int b = Integer.parseInt(st.nextToken()) - 1; // 질투하는 학생의 열 위치
        int[][] students = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean jealous = false;
        for (int i = 0; i < N; i++) {
            if (students[a][i] > students[a][b] || students[i][b] > students[a][b]) {
                jealous = true;
                break;
            }
        }

        System.out.println(jealous ? "ANGRY" : "HAPPY");
    }
}
