import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase(); // 입력을 받고 대문자로 변환
        sc.close();

        int[] charCounts = new int[26]; // 알파벳 개수만큼 배열 생성
        int max = 0; // 가장 많이 사용된 알파벳의 사용 횟수
        char result = '?';

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'A';
            charCounts[index]++;
            if (charCounts[index] > max) {
                max = charCounts[index];
                result = s.charAt(i);
            } else if (charCounts[index] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
