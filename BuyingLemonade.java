//https://codeforces.com/contest/2024/problem/B
import java.util.Arrays;
import java.util.Scanner;

public class BuyingLemonade {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                long k = s.nextLong();
                long[] a = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextLong();
                }
                Arrays.sort(a);
                long ans = k;
                long p = 0;
                for (int i = 0; i <= n; i++) {
                    a[i] -= p;
                    k -= Math.min(k, (n - i) * a[i]);
                    if (k == 0) {
                        break;
                    } else {
                        ans++;
                    }
                    p += a[i];
                }
                System.out.println(ans);
            }
        }
    }
}