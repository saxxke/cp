//https://codeforces.com/problemset/problem/2013/A
import java.util.Scanner;
    public class ZhanBlender {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            long[] TestCase = new long[t];
            for (int i = 0; i < t; i++) {
                long n = scanner.nextLong();
                long x = scanner.nextLong();
                long y = scanner.nextLong();
                if (n == 0) {
                    TestCase[i] = 0;
                    continue;
                }
                long z = Math.min(x, y);
                long time =(n+z-1)/z;
                TestCase[i] = time;
            }
            for (long result : TestCase) {
                System.out.println(result);
            }
        }
    }
}


