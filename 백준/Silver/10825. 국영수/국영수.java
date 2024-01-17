import java.util.Arrays;
import java.util.Scanner;

class Student {
    String name;
    int koreanScore;
    int englishScore;
    int mathScore;

    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int koreanScore = sc.nextInt();
            int englishScore = sc.nextInt();
            int mathScore = sc.nextInt();
            students[i] = new Student(name, koreanScore, englishScore, mathScore);
        }

        Arrays.sort(students, (s1, s2) -> {
            if (s1.koreanScore != s2.koreanScore) {
                return Integer.compare(s2.koreanScore, s1.koreanScore);
            } else if (s1.englishScore != s2.englishScore) {
                return Integer.compare(s1.englishScore, s2.englishScore);
            } else if (s1.mathScore != s2.mathScore) {
                return Integer.compare(s2.mathScore, s1.mathScore);
            } else {
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student student : students) {
            System.out.println(student.name);
        }

        sc.close();
    }
}
