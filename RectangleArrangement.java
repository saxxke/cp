//https://codeforces.com/contest/2027/problem/A
import java.util.Scanner;

public class RectangleArrangement {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long t = s.nextInt();
            while (t-- > 0) {
                long n = s.nextInt();
                long w1 =Integer.MIN_VALUE;
                long h1 =Integer.MIN_VALUE;
                while (n-- > 0) {
                    long w = s.nextLong();
                    long h = s.nextLong();
                    w1 = Math.max(w, w1);
                    h1 = Math.max(h, h1);
                }
                System.out.println(2 * (w1 + h1));
            }
        }
    }
}
