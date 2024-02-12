import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[8][2];
        for (int i = 0; i < 8; i++) {
            scores[i][0] = sc.nextInt(); 
            scores[i][1] = i + 1; 
        }

        Arrays.sort(scores, (a, b) -> b[0] - a[0]); 

        int sum = 0;
        int[] topIndices = new int[5];
        for (int i = 0; i < 5; i++) {
            sum += scores[i][0];
            topIndices[i] = scores[i][1];
        }
        Arrays.sort(topIndices); 

        System.out.println(sum);
        for (int i : topIndices) {
            System.out.print(i + " ");
        }
    }
}
