//https://codeforces.com/problemset/problem/2009/C
import java.util.Scanner;

public class FreyaFrog {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                long x = s.nextLong();
                long y = s.nextLong();
                long k = s.nextLong();
                long a = (x + k - 1) / k;
                long b = (y + k - 1) / k;
                long c;
                if (a > b) {
                    c = 2 * a - 1;
                } else {
                    c = 2 * b;
                }
                System.out.println(c);
            }
        }
    }
}
