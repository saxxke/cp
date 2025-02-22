//https://codeforces.com/contest/2036/problem/A
import java.util.Scanner;

public class Quintomania {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int[] a = new int[n];
                int c = 0;
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }
                for (int i = 1; i < n; i++) {
                    if (a[i] - a[i - 1] != 5 && a[i] - a[i - 1] != -5 && a[i] - a[i - 1] != 7 && a[i] - a[i - 1] != -7)
                        c++;
                }
                if (c > 0)
                    System.out.println("NO");
                else
                    System.out.println("YES");

            }
        }
    }
}