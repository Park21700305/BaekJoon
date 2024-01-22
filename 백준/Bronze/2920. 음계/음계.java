import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = "";
        for (int i = 0; i < 8; i++) {
            sequence += sc.nextInt();
        }

        if (sequence.equals("12345678")) {
            System.out.println("ascending");
        } else if (sequence.equals("87654321")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        sc.close();
    }
}
