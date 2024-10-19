//https://codeforces.com/contest/2025/problem/A
import java.util.Scanner;

public class TwoScreen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int q = sc.nextInt();
            sc.nextLine();
            while (q-- > 0) {
                String s = sc.nextLine();
                String t = sc.nextLine();
                char[] a = s.toCharArray();
                char[] b = t.toCharArray();
                int n = s.length();
                int m = t.length();
                int c = 0;
                for (int i = 0; i < Math.min(n, m); i++) {
                    if (a[i] == b[i])
                        c++;
                    else
                        break;
                }
                int T = c + (n - c) + (m - c);
                if (c != 0)
                    T++;
                System.out.println(T);
            }
        }
    }
}
