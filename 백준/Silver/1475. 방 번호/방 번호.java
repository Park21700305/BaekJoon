import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();
        int[] counts = new int[10];

        for (int i = 0; i < roomNumber.length(); i++) {
            int digit = roomNumber.charAt(i) - '0';
            counts[digit]++;
        }

        int totalSets = (counts[6] + counts[9] + 1) / 2;
        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                totalSets = Math.max(totalSets, counts[i]);
            }
        }

        System.out.println(totalSets);
    }
}
