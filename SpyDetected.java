//https://codeforces.com/contest/1512/problem/A
import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int[] a = new int[n];
                Boolean found = false;
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }
                for (int i = 1; i < n - 1; i++) {
                    if (a[i] != a[i - 1] && a[i] != a[i + 1]) {
                        System.out.println(i + 1);
                        found = true;
                    }
                }
                if (!found) {
                    if (a[0] != a[1]) {
                        System.out.println(1);
                    } else {
                        System.out.println(n);
                    }
                }
            }
        }
    }
}
