import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "top":
                    bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
