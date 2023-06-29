import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / N;
        double adjustedAverage = average / max * 100;

        System.out.println(adjustedAverage);
    }
}
