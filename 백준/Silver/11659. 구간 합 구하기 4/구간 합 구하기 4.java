import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st1.nextToken());
        int quizNo = Integer.parseInt(st1.nextToken());
        long[]S = new long[suNo+1];
        st1 = new StringTokenizer(br.readLine());
        for(int i = 1; i <= suNo; i++) {
            S[i] = S[i-1] + Integer.parseInt(st1.nextToken());
        }
        for(int i = 0; i < quizNo; i++) {
            st1 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st1.nextToken());
            int end = Integer.parseInt(st1.nextToken());
            System.out.println(S[end] - S[start-1]);
        }
    }
}