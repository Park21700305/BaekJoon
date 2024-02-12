import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        
        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        
        while(queue.size() > 1) {
            queue.poll(); // 제일 위의 카드를 버림
            queue.offer(queue.poll()); // 그 다음 위의 카드를 제일 아래로 옮김
        }
        
        System.out.println(queue.poll()); // 마지막에 남은 카드 출력
    }
}
