//https://codeforces.com/contest/2033/problem/B
import java.util.Scanner;

public class SakurakoAndWater {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int ans = 0;
                int[][] a = new int[n][n];
                int[] d = new int[2 * n - 1];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = s.nextInt();
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        d[i - j + n - 1] = Math.min(d[i - j + n - 1], a[i][j]);
                    }
                }
                for (int i = 0; i < 2 * n - 1; i++) {
                    if (d[i] < 0) {
                        ans -= d[i];
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
