//https://codeforces.com/problemset/problem/1328/A
import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
                int a = s.nextInt();
                int b = s.nextInt();
                if (a % b == 0) {
                    System.out.println(0);
                } else {
                    int d = a / b;
                    int p = (d + 1) * b;
                    System.out.println(p - a);
                }
            }
        }
    }
}
