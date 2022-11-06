import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[1002];
        int num1, num2;
        int sum = 0;
        int count = 1;
        num[0] = 0;

        for(int i = 1; i < num.length; i++){
            for(int j = 0; j < i; j++){
                if(count == 1001) break;
                num[count++] = i;
            }
        }
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for(int i = num1; i <= num2; i++){
            sum += num[i];
        }

        System.out.println(sum);
    }
}
