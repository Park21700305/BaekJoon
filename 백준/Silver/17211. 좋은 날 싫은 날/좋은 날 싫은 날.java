import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int currentFeel = scanner.nextInt(); // 현재 재현이의 기분 (좋은 날: 0, 싫은 날: 1)
        double[] goodProb = new double[N + 1];
        double[] badProb = new double[N + 1];

        double goodToGood = scanner.nextDouble();
        double goodToBad = scanner.nextDouble();
        double badToGood = scanner.nextDouble();
        double badToBad = scanner.nextDouble();

        // 초기 확률 설정
        goodProb[0] = (currentFeel == 0) ? 1.0 : 0.0;
        badProb[0] = (currentFeel == 1) ? 1.0 : 0.0;

        for (int i = 1; i <= N; i++) {
            goodProb[i] = goodProb[i - 1] * goodToGood + badProb[i - 1] * badToGood;
            badProb[i] = goodProb[i - 1] * goodToBad + badProb[i - 1] * badToBad;
        }

        int goodPercentage = (int) Math.round(goodProb[N] * 1000);
        int badPercentage = (int) Math.round(badProb[N] * 1000);

        System.out.println(goodPercentage);
        System.out.println(badPercentage);

        scanner.close();
    }
}
