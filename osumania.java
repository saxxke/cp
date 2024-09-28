//https://codeforces.com/problemset/problem/2009/B
import java.util.Scanner;

public class osumania {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                s.nextLine();
                String[] m = new String[n];
                for (int i = 0; i < n; i++) {
                    m[i] = s.nextLine();
                }
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(m[i].indexOf("#") + 1 + " " );
                }
                System.out.println();
            }
        }
    }
}
