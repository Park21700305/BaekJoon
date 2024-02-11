import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();

        int totalTime = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch <= 'C') totalTime += 3;
            else if (ch <= 'F') totalTime += 4;
            else if (ch <= 'I') totalTime += 5;
            else if (ch <= 'L') totalTime += 6;
            else if (ch <= 'O') totalTime += 7;
            else if (ch <= 'S') totalTime += 8;
            else if (ch <= 'V') totalTime += 9;
            else totalTime += 10;
        }

        System.out.println(totalTime);
    }
}
