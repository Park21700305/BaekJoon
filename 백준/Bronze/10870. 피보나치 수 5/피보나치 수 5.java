import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static int fib(int n){
        if(n <= 1) return n;
        return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(fib(num) + "\n");
    }
}
