import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] numbers = sc.next().toCharArray();
        Arrays.sort(numbers);
        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }
}
