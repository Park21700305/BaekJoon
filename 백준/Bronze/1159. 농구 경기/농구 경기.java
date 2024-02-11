import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26]; // 알파벳 개수만큼 배열 생성
        int n = sc.nextInt(); // 선수의 수 입력 받기

        for (int i = 0; i < n; i++) {
            String name = sc.next(); // 선수 이름 입력 받기
            alphabet[name.charAt(0) - 'a']++; // 이름의 첫 글자에 해당하는 배열 값 증가
        }
        sc.close();

        boolean isPrinted = false;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] >= 5) { // 동명이인이 5명 이상인 경우
                System.out.print((char) (i + 'a')); // 해당 알파벳 출력
                isPrinted = true;
            }
        }

        if (!isPrinted) { // 출력된 알파벳이 없는 경우
            System.out.println("PREDAJA"); // PREDAJA 출력
        }
    }
}
