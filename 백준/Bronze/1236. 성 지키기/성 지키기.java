import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 성의 행의 수
        int M = Integer.parseInt(st.nextToken()); // 성의 열의 수

        boolean[] rowGuard = new boolean[N]; // 각 행에 경비원이 있는지 여부
        boolean[] colGuard = new boolean[M]; // 각 열에 경비원이 있는지 여부

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowGuard[i] = true;
                    colGuard[j] = true;
                }
            }
        }

        int rowCount = 0;
        int colCount = 0;

        for (boolean hasGuard : rowGuard) {
            if (!hasGuard) rowCount++;
        }

        for (boolean hasGuard : colGuard) {
            if (!hasGuard) colCount++;
        }

        System.out.println(Math.max(rowCount, colCount));
    }
}
