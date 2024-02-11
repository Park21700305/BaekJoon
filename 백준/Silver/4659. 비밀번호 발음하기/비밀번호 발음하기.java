import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String password = sc.next();
            if (password.equals("end")) break; // 입력의 끝을 확인
            System.out.println("<" + password + "> is " + (isValidPassword(password) ? "acceptable." : "not acceptable."));
        }
        sc.close();
    }

    public static boolean isValidPassword(String password) {
        boolean hasVowel = false;
        int consecutiveVowel = 0;
        int consecutiveConsonant = 0;
        char lastChar = ' ';

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isVowel(ch)) {
                hasVowel = true;
                consecutiveVowel++;
                consecutiveConsonant = 0;
            } else {
                consecutiveConsonant++;
                consecutiveVowel = 0;
            }

            if (consecutiveVowel > 2 || consecutiveConsonant > 2) return false;
            if (lastChar == ch && ch != 'e' && ch != 'o') return false;
            lastChar = ch;
        }

        return hasVowel;
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) >= 0;
    }
}
