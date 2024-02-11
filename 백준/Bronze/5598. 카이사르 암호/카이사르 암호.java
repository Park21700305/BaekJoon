import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encrypted = sc.next();
        sc.close();

        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            // 알파벳을 3글자 뒤로 밀기
            if (c <= 'C') c += 23; // A, B, C의 경우
            else c -= 3;
            System.out.print(c);
        }
    }
}
