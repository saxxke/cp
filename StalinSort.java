//https://codeforces.com/contest/2027/problem/B
import java.util.Scanner;

public class StalinSort {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                long[] a = new long[n];
                long ans = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextLong();
                }
                for (int i = 0; i < n; i++) {
                    long c = i;
                    for (int j = 1; j < n; j++) {
                        if (a[j] > a[i])
                            c++;
                    }
                    ans = Math.min(ans, c);
                }
                System.out.println(ans);
            }
        }
    }
}
