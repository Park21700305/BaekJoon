import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = sc.nextInt();
        }
        Arrays.sort(numArr);
        for (int i = 0; i < N; i++) {
            System.out.println(numArr[i]);
        }
    }
}
