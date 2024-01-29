import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num * num;
        }

        int lastDigit = sum % 10;
        System.out.println(lastDigit);

        scanner.close();
    }
}
