import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) count++;
        }
        sc.close();
        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (i > 0 && word.charAt(i) != word.charAt(i - 1) && seen[index]) {
                return false;
            }
            seen[index] = true;
        }
        return true;
    }
}
