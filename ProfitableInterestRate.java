//https://codeforces.com/contest/2024/problem/A
import java.util.Scanner;

public class ProfitableInterestRate {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int a = s.nextInt();
                int b = s.nextInt();
                if (b >= 2 * a) {
                    System.out.println(0);
                } else {
                    System.out.println(Math.min(a, a - (b - a)));
                }
            }
        }
    }
}