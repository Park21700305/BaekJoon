import java.util.Scanner;

public class Main {
    static int count = 0;
    static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else{
            count++;
            return recursion(s, l+1, r-1);
        }

    }

    static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int num = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<num; i++){
            count = 0;
            String string = sc.nextLine();
            count++;
            System.out.println(isPalindrome(string) + " " + count);
        }
    }
}
