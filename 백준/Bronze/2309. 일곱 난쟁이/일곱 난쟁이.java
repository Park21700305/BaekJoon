import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heightArr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            heightArr[i] = sc.nextInt();
            sum += heightArr[i];
        }
        Arrays.sort(heightArr);
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - heightArr[i] - heightArr[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(heightArr[k]);
                    }
                    return;
                }
            }
        }
    }
}
