import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    queue.offer(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    Integer item = queue.poll();
                    bw.write((item != null ? item : -1) + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    Integer front = queue.peek();
                    bw.write((front != null ? front : -1) + "\n");
                    break;
                case "back":
                    Integer back = (queue.isEmpty() ? null : ((LinkedList<Integer>) queue).getLast());
                    bw.write((back != null ? back : -1) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
