import java.util.*;

public class Main {
    static int[][] map;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[n][m][2];
        queue.offer(new int[]{0, 0, 1, 0});
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], dist = current[2], breakWall = current[3];

            if (x == n - 1 && y == m - 1) return dist;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (map[nx][ny] == 0 && !visited[nx][ny][breakWall]) {
                    queue.offer(new int[]{nx, ny, dist + 1, breakWall});
                    visited[nx][ny][breakWall] = true;
                } else if (map[nx][ny] == 1 && breakWall == 0 && !visited[nx][ny][1]) {
                    queue.offer(new int[]{nx, ny, dist + 1, 1});
                    visited[nx][ny][1] = true;
                }
            }
        }
        return -1;
    }
}
