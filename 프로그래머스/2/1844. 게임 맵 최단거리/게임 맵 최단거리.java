import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[][] maps) {
        return bfs(maps);
    }

    private int bfs(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상, 하, 좌, 우 이동
        boolean[][] visited = new boolean[n][m];

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == n - 1 && y == m - 1) { // 도착지점에 도달
                return maps[x][y];
            }

            for (int[] direction : directions) {
                int nextX = x + direction[0];
                int nextY = y + direction[1];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m 
                    && maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.offer(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    maps[nextX][nextY] = maps[x][y] + 1;
                }
            }
        }

        return -1; // 도착지점에 도달할 수 없음
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] maps1 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(solution.solution(maps1)); // 11 출력

        int[][] maps2 = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        System.out.println(solution.solution(maps2)); // -1 출력
    }
}
