import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] attractiveness;
    static int[][] maxInRow;
    static int[][] maxInColumn;

    static void buildMaxInRow(int node, int left, int right, int row) {
        if (left == right) {
            maxInRow[row][node] = attractiveness[row][left];
            return;
        }

        int mid = (left + right) / 2;
        buildMaxInRow(node * 2, left, mid, row);
        buildMaxInRow(node * 2 + 1, mid + 1, right, row);
        maxInRow[row][node] = Math.max(maxInRow[row][node * 2], maxInRow[row][node * 2 + 1]);
    }

    static void buildMaxInColumn(int node, int left, int right, int col) {
        if (left == right) {
            maxInColumn[col][node] = attractiveness[left][col];
            return;
        }

        int mid = (left + right) / 2;
        buildMaxInColumn(node * 2, left, mid, col);
        buildMaxInColumn(node * 2 + 1, mid + 1, right, col);
        maxInColumn[col][node] = Math.max(maxInColumn[col][node * 2], maxInColumn[col][node * 2 + 1]);
    }

    static int queryMaxInRow(int node, int left, int right, int row, int queryLeft, int queryRight) {
        if (queryRight < left || queryLeft > right) {
            return 0;
        }
        if (queryLeft <= left && right <= queryRight) {
            return maxInRow[row][node];
        }

        int mid = (left + right) / 2;
        int leftMax = queryMaxInRow(node * 2, left, mid, row, queryLeft, queryRight);
        int rightMax = queryMaxInRow(node * 2 + 1, mid + 1, right, row, queryLeft, queryRight);
        return Math.max(leftMax, rightMax);
    }

    static int queryMaxInColumn(int node, int left, int right, int col, int queryLeft, int queryRight) {
        if (queryRight < left || queryLeft > right) {
            return 0;
        }
        if (queryLeft <= left && right <= queryRight) {
            return maxInColumn[col][node];
        }

        int mid = (left + right) / 2;
        int leftMax = queryMaxInColumn(node * 2, left, mid, col, queryLeft, queryRight);
        int rightMax = queryMaxInColumn(node * 2 + 1, mid + 1, right, col, queryLeft, queryRight);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        attractiveness = new int[N][N];
        maxInRow = new int[N][4 * N];
        maxInColumn = new int[N][4 * N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                attractiveness[i][j] = Integer.parseInt(st.nextToken());
            }
            buildMaxInRow(1, 0, N - 1, i);
        }

        for (int j = 0; j < N; j++) {
            buildMaxInColumn(1, 0, N - 1, j);
        }

        int ericAttractiveness = attractiveness[a - 1][b - 1];

        int maxInCurrentRow = queryMaxInRow(1, 0, N - 1, a - 1, 0, N - 1);
        int maxInCurrentColumn = queryMaxInColumn(1, 0, N - 1, b - 1, 0, N - 1);

        if (ericAttractiveness < Math.max(maxInCurrentRow, maxInCurrentColumn)) {
            System.out.println("ANGRY");
        } else {
            System.out.println("HAPPY");
        }
    }
}
