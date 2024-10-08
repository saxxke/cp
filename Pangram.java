//https://codeforces.com/contest/520/problem/A
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            @SuppressWarnings("unused")
            int t = s.nextInt();
            String p = s.next();
            int k = 0;
            for (char i = 'a'; i <= 'z'; i++) {
                if (p.toLowerCase().contains(String.valueOf(i))) {
                    k++;
                }
            }
            if (k == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}