import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 점의 개수 N을 입력받음
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }

        Arrays.sort(points, (p1, p2) -> {
            if (p1.x == p2.x) {
                return p1.y - p2.y; // x좌표가 같으면 y좌표 순으로 정렬
            } else {
                return p1.x - p2.x; // x좌표가 다르면 x좌표 순으로 정렬
            }
        });

        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
